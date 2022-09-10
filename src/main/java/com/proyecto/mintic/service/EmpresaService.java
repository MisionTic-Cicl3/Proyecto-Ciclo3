package com.proyecto.mintic.service;

import com.proyecto.mintic.entity.EmpresaEntity;
import com.proyecto.mintic.Repository.EmpresaRepository;
import org.springframework.data.util.ReflectionUtils;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

public class EmpresaService {
    /*private EmpresaRepository repositorio;

    public EmpresaService(EmpresaRepository repositorio){
        this.repositorio=repositorio;
    }

    public Optional <EmpresaEntity> buscarEmpresa(String nombreEmpresa){
        return repositorio.findById(nombreEmpresa);
    }

    public String agregarEmpresa(EmpresaEntity empresa) {
        if (!buscarEmpresa(empresa.getNombreEmpresa()).isPresent()) {
            repositorio.save(empresa);
            return "La empresa se registró correctamente.";
        } else {
            return "La empresa ya existe. ";
        }
    }

    public String eliminarEmpresa(String nombreEmpresa){
        if(buscarEmpresa(nombreEmpresa).isPresent()){
            repositorio.deleteById(nombreEmpresa);
            return "Empresa eliminada";
        } else {
            return "La empresa a eliminar no existe";
        }
    }*/
}
