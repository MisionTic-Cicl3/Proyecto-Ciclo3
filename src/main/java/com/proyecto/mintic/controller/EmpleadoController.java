package com.proyecto.mintic.controller;

import com.proyecto.mintic.entity.EmpleadoEntity;
import com.proyecto.mintic.service.EmpleadoService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/AgregarEmpleado")
        public String agregarEmpleado(@RequestBody EmpleadoEntity Empleado){
        return service.agregarEmpleado(Empleado);
    }
    @PutMapping("/ActualizarEmpleado")
        public String actualizarEmpleado(@RequestBody EmpleadoEntity Empleado){
        return service.actualizarEmpleado(Empleado);
    }

    @DeleteMapping("/EliminarEmpleado")
    public String eliminarEmpleado(@PathVariable("id")long id) {return service.eliminarEmpleado(id);}

}
