package com.jh.groceriesapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GroceriesApiApplication

fun main(args: Array<String>) {
    runApplication<GroceriesApiApplication>(*args)
}
