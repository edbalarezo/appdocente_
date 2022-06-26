package com.erikabalarezo.primerapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
class ProductServiceTest {
    @Autowired
    lateinit var productService: ProductService

    @Test
    fun validateSerialIsValid(){
        val response =  productService.validateSerialNumber("786456789")
        Assertions.assertEquals(true,response)
    }

    @Test
    fun validateSerialIsInvalid(){
        val response =  productService.validateSerialNumber("32154697")
        Assertions.assertEquals(false,response)
    }

    @Test
    fun validateSerialIsBlank(){
        Assertions.assertThrows(Exception::class.java) {
            val response = productService.validateSerialNumber("")

        }
    }

    @Test
    fun validateSerialIsincomplete(){
        Assertions.assertThrows(Exception::class.java) {
            val response = productService.validateSerialNumber("1")

        }
    }

}