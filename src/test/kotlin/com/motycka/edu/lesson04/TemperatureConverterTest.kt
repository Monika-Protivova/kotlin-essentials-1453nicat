package com.motycka.edu.lesson04

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.doubles.plusOrMinus

class TemperatureConverterTest : StringSpec({

    val converter = TemperatureConverter()

    "convert 32°F to 0°C" {
        converter.toCelsius(32.0) shouldBe 0.0
    }

    "convert 98.6°F to approx 37°C" {
        converter.toCelsius(98.6) shouldBe (37.0 plusOrMinus 0.01)
    }
})
