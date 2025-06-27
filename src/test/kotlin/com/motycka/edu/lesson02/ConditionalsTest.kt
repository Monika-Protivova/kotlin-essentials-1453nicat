package com.motycka.edu.lesson02
fun conditionals() {
    val coffeeOrders = mutableMapOf<Int, List<String>>()
    coffeeOrders[1] = listOf(ESPRESSO, CAPPUCCINO, LATTE, AMERICANO)  // 4 items in order 1
    coffeeOrders[2] = listOf(ESPRESSO, DOUBLE_ESPRESSO, FLAT_WHITE)   // 3 items in order 2

    coffeeOrders.forEach { (orderId, items) ->
        println("Processing Order ID: $orderId")
        println("Items: $items")

        val prices = items.map { getPrice(it) }

        val discount = if (items.size >= 3) {
            println("You ordered 3 or more coffees, you get 1 for free!")
            prices.minOrNull() ?: 0.0
        } else {
            0.0
        }

        val total = prices.sum() - discount

        // Print total without formatting to ensure it matches the expected output
        println("Total price for Order ID $orderId: $total")
        println()  // blank line to separate orders
    }
}

fun getPrice(item: String): Double = when (item) {
    ESPRESSO -> ESPRESSO_PRICE
    DOUBLE_ESPRESSO -> DOUBLE_ESPRESSO_PRICE
    CAPPUCCINO -> CAPPUCCINO_PRICE
    LATTE -> LATTE_PRICE
    MACCHIATO -> MACCHIATO_PRICE
    MOCHA -> MOCHA_PRICE
    FLAT_WHITE -> FLAT_WHITE_PRICE
    AMERICANO -> AMERICANO_PRICE
    else -> error("Item not on menu: $item")
}

fun main() {
    conditionals()
}