//package com.motycka.edu.lesson02
//
//import com.motycka.edu.captureStdout
//import io.kotest.core.spec.style.StringSpec
//import io.kotest.matchers.string.shouldContain
//
//class ConditionalsTest : StringSpec({
//
//    "output should contain order 1 details correctly" {
//        val output = captureStdout {
//            conditionals()
//        }.trim() // trim output to avoid trailing newlines
//
//        output shouldContain """
//            Processing Order ID: 1
//            Items: [Espresso, Cappuccino, Latte, Americano]
//            You ordered 3 or more coffees, you get 1 for free!
//            Total price for Order ID 1: 9.0
//        """.trimIndent().trim() // trim expected substring as well
//    }
//
//    "output should contain order 2 details correctly" {
//        val output = captureStdout {
//            conditionals()
//        }.trim()
//
//        output shouldContain """
//            Processing Order ID: 2
//            Items: [Espresso, Double Espresso, Flat White]
//            You ordered 3 or more coffees, you get 1 for free!
//            Total price for Order ID 2: 6.199999999999999
//        """.trimIndent().trim()
//    }
//})