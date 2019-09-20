package com.kotlin.harman.ecommerce

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ECommerceApplication

fun main(args: Array<String>) {
	runApplication<ECommerceApplication>(*args)
}
