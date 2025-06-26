package com.motycka.edu.lesson04

import io.github.oshai.kotlinlogging.KotlinLogging

private val logger = KotlinLogging.logger { }

fun main() {
    val converter = TemperatureConverter()

    logger.info { "Starting temperature conversion demo..." }

    // Regular conversions
    val fahrenheit1 = 32.0
    val celsius1 = converter.toCelsius(fahrenheit1)
    logger.info { "$fahrenheit1°F = $celsius1°C" }

    val fahrenheit2 = 212.0
    val celsius2 = converter.toCelsius(fahrenheit2)
    logger.info { "$fahrenheit2°F = $celsius2°C" }

    val celsius3 = 100.0
    val fahrenheit3 = converter.toFahrenheit(celsius3)
    logger.info { "$celsius3°C = $fahrenheit3°F" }

    // Negative temperature
    val negativeFahrenheit = -40.0
    val negativeCelsius = converter.toCelsius(negativeFahrenheit)
    logger.warn { "Negative temp: $negativeFahrenheit°F = $negativeCelsius°C" }

    // Very large value
    val largeFahrenheit = 10000.0
    val largeCelsius = converter.toCelsius(largeFahrenheit)
    logger.debug { "Extreme high: $largeFahrenheit°F = $largeCelsius°C" }

    // Very small value
    val smallFahrenheit = -1000.0
    val smallCelsius = converter.toCelsius(smallFahrenheit)
    logger.debug { "Extreme low: $smallFahrenheit°F = $smallCelsius°C" }

    // Round-trip conversion
    val originalCelsius = 42.0
    val roundTripFahrenheit = converter.toFahrenheit(originalCelsius)
    val roundTripCelsius = converter.toCelsius(roundTripFahrenheit)
    logger.info { "Round-trip: $originalCelsius°C -> $roundTripFahrenheit°F -> $roundTripCelsius°C" }

    logger.trace { "Temperature conversion demo completed." }
}