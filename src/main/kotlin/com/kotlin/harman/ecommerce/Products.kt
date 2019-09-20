package com.kotlin.harman.ecommerce

import org.springframework.boot.runApplication
import javax.persistence.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Table

@Entity
@Table(name="products")
data class Products(
@Id @GeneratedValue var id: Long? = null,
val name: String,
val description :String)



