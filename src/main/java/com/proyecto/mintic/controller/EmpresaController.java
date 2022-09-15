package com.proyecto.mintic.controller;

import com.proyecto.mintic.entity.EmpresaEntity;
import com.proyecto.mintic.service.EmpresaService;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
@RestController
public class EmpresaController {


    public EmpresaService service;

    public EmpresaController(EmpresaService Service){
        this.service=service;
    }

    @GetMapping("/ListarEmpresas")
    public ArrayList<EmpresaEntity> listar(){
        return service.listarEmpresas();
    }

    @GetMapping("/BuscarEmpresa/{id}")
    public Optional<EmpresaEntity>buscarEmpresa(@PathVariable("id") long id){
        return service.buscarEmpresa(id);
    }

    @GetMapping("/BuscarDocumento/{documento}")
    public ArrayList<EmpresaEntity> buscarDocumento(@PathVariable("documento") String document){
        return service.buscarDocument(document);
    }

    @PostMapping("/AgregarEmpresa")
    public String agregarEmpresa(@RequestBody EmpresaEntity empresa){
        return service.agregarEmpresa(empresa);
    }

    @DeleteMapping("/EliminarEmpresa/{id}")
    public String eliminarEmpresa(@PathVariable("id") Long id){
        return service.eliminarEmpresa(id);
    }
}
