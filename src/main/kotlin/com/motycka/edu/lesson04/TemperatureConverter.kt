package com.motycka.edu.lesson04

class TemperatureConverter {
    fun toCelsius(fahrenheit: Double): Double {
        return (fahrenheit - 32) * 5.0 / 9.0
    }

    fun toFahrenheit(celsius: Double): Double {
        return celsius * 9.0 / 5.0 + 32
    }
}
