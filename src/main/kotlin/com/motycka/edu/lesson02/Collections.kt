package com.motycka.edu.lesson02

// Coffee name constants (defined here, only for Collections.kt)
const val ESPRESSO = "Espresso"
const val DOUBLE_ESPRESSO = "Double Espresso"
const val CAPPUCCINO = "Cappuccino"
const val LATTE = "Latte"
const val MACCHIATO = "Macchiato"
const val MOCHA = "Mocha"
const val FLAT_WHITE = "Flat White"
const val AMERICANO = "Americano"

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
    val orders = mutableMapOf<Int, List<String>>()

    println("\nWelcome to the Coffee Shop! Here is our menu:")
    coffeeMenu.forEach { println(it) }

    // Create orders
    val order1 = listOf(ESPRESSO, CAPPUCCINO, CAPPUCCINO, AMERICANO)
    val order2 = listOf(ESPRESSO, DOUBLE_ESPRESSO, FLAT_WHITE)

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
