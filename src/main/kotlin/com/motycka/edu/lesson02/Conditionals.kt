package com.motycka.edu.lesson02

fun conditionals() {
    val coffeeOrders = mapOf(
        1 to listOf(ESPRESSO, CAPPUCCINO, LATTE, AMERICANO),
        2 to listOf(ESPRESSO, DOUBLE_ESPRESSO, FLAT_WHITE)
    )

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
        println("Total price for Order ID $orderId: $total") // Print total without formatting
        println()
    }
}

fun getPrice(item: String): Double {
    return when (item) {
        ESPRESSO -> ESPRESSO_PRICE
        DOUBLE_ESPRESSO -> DOUBLE_ESPRESSO_PRICE
        CAPPUCCINO -> CAPPUCCINO_PRICE
        LATTE -> LATTE_PRICE
        MACCHIATO -> MACCHIATO_PRICE
        MOCHA -> MOCHA_PRICE
        FLAT_WHITE -> FLAT_WHITE_PRICE
        AMERICANO -> AMERICANO_PRICE
        else -> throw IllegalArgumentException("Unknown coffee type: $item")
    }
}

fun main() {
    conditionals()
}