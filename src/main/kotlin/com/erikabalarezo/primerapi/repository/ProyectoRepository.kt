package com.erikabalarezo.primerapi.repository

import com.erikabalarezo.primerapi.model.Proyecto
import org.springframework.data.jpa.repository.JpaRepository

interface ProyectoRepository: JpaRepository <Proyecto, Long> {

    fun findById (id:Long?): Proyecto?
}