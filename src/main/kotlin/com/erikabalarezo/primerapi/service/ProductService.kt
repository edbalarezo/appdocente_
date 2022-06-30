package com.erikabalarezo.primerapi.service

import org.springframework.stereotype.Service

@Service
class ProductService {
    fun validateSerialNumber(serial: String?): Boolean? {

        serial.takeIf { !it?.trim().isNullOrEmpty() }
                ?: throw Exception()

        if (serial?.substring(0, 3).equals("786"))
            return true

        return false


        /*try {
                serial.takeIf { !it?.trim().isNullOrEmpty() }
                    ?: throw Exception()
                if (serial?.substring(0, 3).equals("786"))
                    return true
                return false
            }
            catch (e: Exception) {
                throw Exception()
            }*/
    }

    fun multiplicacion (coeficiente: Int, digito: Int): Int {
        val response = coeficiente * digito
        if (response >= 10)
            return response - 9
        return response

    }

    fun sumaValores(nui: String): Long {
        var sum: Long = 0
        for (i in 0..8) {
            val coeficiente = if (i % 2 == 0) 2 else 1
            sum += multiplicacion(coeficiente, Integer.parseInt(nui[i].toString()))
        }
        return sum
    }

    fun findDecenaSuperior(sum: Int): Int { // buscar la decena superior

        val division: Int = sum /10
        val decenaSuperior: Int = (division+1) * 10
        var response: Int = decenaSuperior-sum
        if (decenaSuperior == 10 )
            response = 0
        return response
    }

    fun validarCedula (cedula:String): Boolean {

        return true
    }
}