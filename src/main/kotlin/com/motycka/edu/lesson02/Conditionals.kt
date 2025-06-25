package com.motycka.edu.lesson02

const val ESPRESSO_PRICE = 2.5
const val DOUBLE_ESPRESSO_PRICE = 3.0
const val CAPPUCCINO_PRICE = 3.0
const val LATTE_PRICE = 3.5
const val MACCHIATO_PRICE = 3.3
const val MOCHA_PRICE = 3.6
const val FLAT_WHITE_PRICE = 3.2
const val AMERICANO_PRICE = 2.0

fun conditionals() {
    val coffeeOrders = mutableMapOf<Int, List<String>>()
    coffeeOrders[1] = listOf(ESPRESSO, CAPPUCCINO)
    coffeeOrders[2] = listOf(ESPRESSO, DOUBLE_ESPRESSO, FLAT_WHITE)

    coffeeOrders.forEach { (orderId, items) ->
        println("Processing Order ID: $orderId")
        println("Items: $items")
        val prices = items.map { getPrice(it) }
        val discount = if (items.size >= 4) {
            println("You ordered 4 or more coffees, you get 1 for free!")
            prices.minOrNull() ?: 0.0
        } else 0.0

        val total = prices.sum() - discount
        println("Total price for Order ID $orderId: $total\n")
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
   conditionals()}