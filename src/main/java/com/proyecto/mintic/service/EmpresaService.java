package com.proyecto.mintic.service;

import com.proyecto.mintic.entity.EmpresaEntity;
import com.proyecto.mintic.Repository.EmpresaRepository;
import org.springframework.data.util.ReflectionUtils;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

public class EmpresaService {
    private EmpresaRepository repositorio;

    public EmpresaService(EmpresaRepository repositorio){
        this.repositorio=repositorio;
    }

    public Optional <EmpresaEntity> buscarempresa(String nombreEmpresa){
        return repositorio.findById(nombreEmpresa);
    }

    public String agregarEmpresa(EmpresaEntity empresa) {
        if (!buscarempresa(empresa.getNombreEmpresa()).isPresent()) {
            repositorio.save(empresa);
            return "La empresa se registró correctamente.";
        } else {
            return "La empresa ya existe. ";
        }
    }




}
