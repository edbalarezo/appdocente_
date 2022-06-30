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

    @Test
    fun multiplicacionWhenLessThanTen (){
        val response=productService.multiplicacion(1,7)
        Assertions.assertEquals(7,response)
    }

    @Test
    fun multiplicacionWhenMajorThanTen (){
        val response=productService.multiplicacion(2,7)
        Assertions.assertEquals(5,response)
    }

    @Test
    fun validarSumaNui(){
        val response=productService.sumaValores("0301707030")
        Assertions.assertEquals(20,response)
    }

    @Test
    fun validarDecenaSuperiorCuandoNoEsCero(){
        val response=productService.findDecenaSuperior(13)
        Assertions.assertEquals(7,response)
    }

    @Test
    fun validarDecenaSuperior(){
        val response=productService.findDecenaSuperior(20)
        Assertions.assertEquals(0,response)
    }
}

