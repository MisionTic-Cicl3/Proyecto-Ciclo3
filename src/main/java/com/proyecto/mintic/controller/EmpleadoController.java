package com.proyecto.mintic.controller;

import com.proyecto.mintic.entity.EmpleadoEntity;
import com.proyecto.mintic.service.EmpleadoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class EmpleadoController {

    private EmpleadoService service;

    public EmpleadoController(EmpleadoService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public ArrayList<EmpleadoEntity> list() {
        return service.listarEmpleado();
    }

    @GetMapping("/user/{id}")
    public Optional<EmpleadoEntity> buscarEmpleado(@PathVariable("id") long id) {
        return service.buscarEmpleado(id);
    }
}

