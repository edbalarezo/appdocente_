package com.erikabalarezo.primerapi.repository

import com.erikabalarezo.primerapi.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository: JpaRepository <Usuario, Long>{

    fun findById (id:Long?): Usuario?
}