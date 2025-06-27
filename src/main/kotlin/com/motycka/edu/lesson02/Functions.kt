package com.motycka.edu.lesson02

// Make sure to import prices and names from a shared CoffeeData.kt

val coffeeOrders = mutableMapOf<Int, List<String>>()
private var nextOrderId = 0

fun placerOrder(items: List<String>): Int {
    val orderId = nextOrderId
    coffeeOrders[orderId] = items
    nextOrderId++
    return orderId
}

fun payOrder(orderId: Int): Double {
    val items = coffeeOrders[orderId] ?: throw IllegalStateException("Order ID $orderId not found.")

    val prices = items.map { getPrice(it) }
    val discount = if (items.size >= 4) prices.minOrNull() ?: 0.0 else 0.0

    return prices.sum() - discount
}

fun completeOrder(orderId: Int) {
    if (!coffeeOrders.containsKey(orderId)) {
        throw IllegalStateException("Order ID $orderId not found.")
    }
    coffeeOrders.remove(orderId)
}

fun processOrder(items: List<String>, payment: Double): Double {
    val orderId = placerOrder(items)
    val totalToPay = payOrder(orderId)

    if (payment < totalToPay) {
        throw IllegalStateException("Insufficient payment. Total to pay is $totalToPay, but received $payment.")
    }

    val change = payment - totalToPay
    println("Payment successful. Total paid: $payment, Total to pay: $totalToPay, change: $change")

    completeOrder(orderId)
    return change
}

fun main() {
    processOrder(listOf(ESPRESSO, CAPPUCCINO, CAPPUCCINO, AMERICANO), 20.0)
    processOrder(listOf(ESPRESSO, FLAT_WHITE, AMERICANO), 10.0)
    // processOrder(listOf(ESPRESSO, ESPRESSO, DOUBLE_ESPRESSO), 5.0) // should fail due to insufficient payment
}