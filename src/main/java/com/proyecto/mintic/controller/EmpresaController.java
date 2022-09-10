package com.proyecto.mintic.controller;

import com.proyecto.mintic.entity.EmpresaEntity;
import com.proyecto.mintic.service.EmpresaService;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

public class EmpresaController {

    /*public EmpresaService service;

    public EmpresaController(EmpresaService Service){
        this.service=service;
    }

    @GetMapping("/BuscarEmpresa/{nombreEmpresa}")
    public ArrayList<EmpresaEntity> buscarEmpresa(@PathVariable("nombreEmpresa")String nombreEmpresa) {
        return service.buscarEmpresa(nombreEmpresa);
    }

    @PostMapping("/AgregarEmpresa")
    public String agregarEmpresa(@RequestBody EmpresaEntity empresa){
        return service.agregarEmpresa(empresa);
    }


    @DeleteMapping("/EliminarEmpresa/{nombreEmpresa}")
    public String eliminarEmpresa(@PathVariable("nombreEmpresa") String nombreEmpresa){
        return service.eliminarEmpresa(nombreEmpresa);
    }*/
}
