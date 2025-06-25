package com.motycka.edu.lesson02

val coffeeOrders = mutableMapOf<Int, List<String>>()

fun main() {
    processOrder(listOf(ESPRESSO, CAPPUCCINO, CAPPUCCINO, AMERICANO), 20.0)
    processOrder(listOf(ESPRESSO, FLAT_WHITE, AMERICANO), 10.0)
    // processOrder(listOf(ESPRESSO, ESPRESSO, DOUBLE_ESPRESSO), 5.0) // should fail due to insufficient payment
}

fun processOrder(items: List<String>, payment: Double): Double {
    val orderId = placerOrder(items)
    val totalToPay = payOrder(orderId)

    if (payment < totalToPay) {
        throw IllegalArgumentException("Insufficient payment: $$payment provided, but $$totalToPay required")
    }

    val change = payment - totalToPay
    println("Order $orderId completed. Total: $${"%.2f".format(totalToPay)}, Payment: $${"%.2f".format(payment)}, Change: $${"%.2f".format(change)}")

    completeOrder(orderId)
    return change
}


fun placerOrder(items: List<String>): Int {
    val orderId = coffeeOrders.size + 1
    coffeeOrders[orderId] = items
    return orderId
}

fun payOrder(orderId: Int): Double {
    val items = coffeeOrders[orderId]
        ?: throw IllegalArgumentException("Order ID $orderId does not exist")

    var totalPrice = items.sumOf { getPrice(it) }

    if (items.size > 3) {
        val cheapestItemPrice = items.minOf { getPrice(it) }
        totalPrice -= cheapestItemPrice
    }

    return totalPrice
}


fun completeOrder(orderId: Int) {
    if (!coffeeOrders.containsKey(orderId)) {
        throw IllegalArgumentException("Order ID $orderId does not exist")
    }
    coffeeOrders.remove(orderId)
}