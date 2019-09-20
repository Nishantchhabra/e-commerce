package com.kotlin.harman.ecommerce

import org.springframework.boot.runApplication
import javax.persistence.Id
import javax.persistence.Entity
import org.springframework.stereotype.Repository
import org.springframework.data.repository.CrudRepository

@Repository
 interface ProductRepo :CrudRepository<Products, Long>{
 }

