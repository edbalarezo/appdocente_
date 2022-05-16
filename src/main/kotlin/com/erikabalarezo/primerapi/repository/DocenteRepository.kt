package com.erikabalarezo.primerapi.repository

import com.erikabalarezo.primerapi.model.Docente
import org.springframework.data.jpa.repository.JpaRepository

interface DocenteRepository: JpaRepository <Docente, Long>{

    fun findById (id:Long?): Docente?

}