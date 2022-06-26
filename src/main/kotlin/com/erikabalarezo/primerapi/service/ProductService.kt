package com.erikabalarezo.primerapi.service

class ProductService {
    fun validateSerialNumber (serial:String?): Boolean?{

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
}