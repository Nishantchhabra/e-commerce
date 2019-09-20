package com.kotlin.harman.ecommerce

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.http.ResponseEntity
import java.util.Optional

@Service
class ECommerceService(val productRepo:ProductRepo){
	
	fun retrieveProduct(productId:Long): Optional<Products>{
		return productRepo.findById(productId)
	}
	
	fun addProduct(products:Products): Unit{
		 productRepo.save(products)
	}
	
	fun retrieveAll():Iterable<Products>{
		return productRepo.findAll()
	}
}

