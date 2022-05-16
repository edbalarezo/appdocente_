package com.erikabalarezo.primerapi.controller

import com.erikabalarezo.primerapi.model.Departamento
import com.erikabalarezo.primerapi.model.Docente
import com.erikabalarezo.primerapi.service.DocenteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping ("/docente")

class DocenteController {

    @Autowired
    lateinit var docenteService: DocenteService

    @GetMapping
    fun list(): List<Docente>{
        return docenteService.list()
    }

    @GetMapping ("/{id}")
    fun listById (@PathVariable("id") id: Long): Docente? {
        return docenteService.getById(id)
    }

    @PostMapping
    fun save(@RequestBody docente:Docente): Docente {
        return docenteService.save(docente)
    }

    @PutMapping
    fun update (@RequestBody docente: Docente): Docente {
        return docenteService.update(docente)
    }

    @PatchMapping
    fun updateName(@RequestBody docente: Docente): Docente {
        return docenteService.updateName(docente)
    }

    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean{
        return docenteService.delete(id)
    }
}