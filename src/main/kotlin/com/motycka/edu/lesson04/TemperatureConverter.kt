package com.motycka.edu.lesson04

import io.github.oshai.kotlinlogging.KotlinLogging

private val logger = KotlinLogging.logger { }

/**
 * Utility object for converting temperature values between Fahrenheit and Celsius
 */
object TemperatureConverter {

    /**
     * Converts temperature value given in Fahrenheit to Celsius
     *
     * @param fahrenheit temperature value in Fahrenheit
     * @return temperature value in Celsius
     */
    fun toCelsius(fahrenheit: Double): Double {
        logger.info { "Converting $fahrenheit°F to Celsius" }
        return (fahrenheit - 32) * 5.0 / 9.0
    }

    /**
     * Converts temperature value given in Celsius to Fahrenheit
     *
     * @param celsius temperature value in Celsius
     * @return temperature value in Fahrenheit
     */
    fun toFahrenheit(celsius: Double): Double {
        logger.info { "Converting $celsius°C to Fahrenheit" }
        return celsius * 9.0 / 5.0 + 32
    }
}

fun main() {
    println("34°C to Fahrenheit: %.2f".format(TemperatureConverter.toFahrenheit(34.0)))
    println("94°F to Celsius: %.2f".format(TemperatureConverter.toCelsius(94.0)))
}
