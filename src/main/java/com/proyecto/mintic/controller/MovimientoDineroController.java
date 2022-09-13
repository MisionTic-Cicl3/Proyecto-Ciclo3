package com.proyecto.mintic.controller;

import com.proyecto.mintic.entity.MovimientoDineroEntity;
import com.proyecto.mintic.service.MovimientoDineroService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class MovimientoDineroController {

    private MovimientoDineroService service;

    public MovimientoDineroController(MovimientoDineroService service) {
        this.service = service;
    }

    @GetMapping("/enterprises/movements")
    public ArrayList<MovimientoDineroEntity> list(){
        return service.listarDinero();
    }

    @GetMapping("/enterprises/{id}/movements")
    public Optional<MovimientoDineroEntity> buscarDinero(@PathVariable("id") long id){
        return service.buscarDinero(id);
    }

    @GetMapping("/enterprises/{empresa}")
    public ArrayList<MovimientoDineroEntity> buscarEmpresad(@PathVariable("empresad") String empresad){
        return service.buscarEmpresad(empresad);
    }

    @PostMapping("/AgregarMovimiento")
    public String agregarMovimiento(@RequestBody MovimientoDineroEntity movimientoDinero){
        return service.agregarDinero(movimientoDinero);
    }

    @PutMapping("/ActualizarDinero")
    protected String actualizaDinero(@RequestBody MovimientoDineroEntity movimientoDinero){
        return service.actualizarDinero(movimientoDinero);
    }

    @DeleteMapping("/EliminarMovimiento/{id}")
    public String eliminarDinero(@PathVariable("id") long id){
        return service.eliminarDinero(id);
    }

}
