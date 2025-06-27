package com.motycka.edu.lesson02

// Coffee name constants
const val ESPRESSO = "Espresso"
const val DOUBLE_ESPRESSO = "Double Espresso"
const val CAPPUCCINO = "Cappuccino"
const val LATTE = "Latte"
const val MACCHIATO = "Macchiato"
const val MOCHA = "Mocha"
const val FLAT_WHITE = "Flat White"
const val AMERICANO = "Americano"


// Price constants
const val ESPRESSO_PRICE = 2.5
const val DOUBLE_ESPRESSO_PRICE = 3.0
const val CAPPUCCINO_PRICE = 3.0
const val LATTE_PRICE = 3.5
const val MACCHIATO_PRICE = 3.3
const val MOCHA_PRICE = 3.6
const val FLAT_WHITE_PRICE = 3.2
const val AMERICANO_PRICE = 2.0


// Immutable list of coffee menu items
val coffeeMenu: List<String> = listOf(
    ESPRESSO,
    DOUBLE_ESPRESSO,
    CAPPUCCINO,
    LATTE,
    MACCHIATO,
    MOCHA,
    FLAT_WHITE,
    AMERICANO
)

fun collections() {
    // Mutable map to store orders
    val orders = mutableMapOf<Int, List<String>>()

    println("\nWelcome to the Coffee Shop! Here is our menu:")
    coffeeMenu.forEach { println(it) }

    // Create two sample orders
    val order1 = listOf(ESPRESSO, CAPPUCCINO, CAPPUCCINO, AMERICANO)
    val order2 = listOf(ESPRESSO, DOUBLE_ESPRESSO, FLAT_WHITE)

    // Add orders to the map
    orders[1] = order1
    orders[2] = order2

    println("\nOrders placed:")
    orders.forEach { (id, items) ->
        println("Order ID: $id, Items: $items")
    }
}

fun main() {
    collections()
}