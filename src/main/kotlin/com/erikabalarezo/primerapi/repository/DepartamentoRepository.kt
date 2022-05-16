package com.erikabalarezo.primerapi.repository

import com.erikabalarezo.primerapi.model.Departamento
import org.springframework.data.jpa.repository.JpaRepository

interface DepartamentoRepository: JpaRepository <Departamento, Long> {
    fun findById (id:Long?): Departamento?
}