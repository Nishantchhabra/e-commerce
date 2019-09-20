package com.kotlin.harman.ecommerce

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import java.util.Optional

@RestController
@RequestMapping("/api")
class ECommerceController(){
	
@Autowired
lateinit var ecommerceService :ECommerceService

@GetMapping("/get/product/{Id}")
fun getProduct(@PathVariable(value="Id") productId:Long): Optional<Products>{
	return ecommerceService.retrieveProduct(productId)
}	

@PostMapping("/add/product")
fun addProduct(@RequestBody products :Products):Unit{
	ecommerceService.addProduct(products)
}

@GetMapping("/get/allproducts")
fun getAllProducts():Iterable<Products>{
	return ecommerceService.retrieveAll()
}
}

