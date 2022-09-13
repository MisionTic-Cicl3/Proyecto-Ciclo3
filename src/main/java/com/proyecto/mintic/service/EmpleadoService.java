package com.proyecto.mintic.service;

import com.proyecto.mintic.Repository.EmpleadoRepository;
import com.proyecto.mintic.entity.EmpleadoEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class EmpleadoService {

    private EmpleadoRepository repository;

    public EmpleadoService(EmpleadoRepository repository){
        this.repository = repository;
    }

    public ArrayList<EmpleadoEntity> listarEmpleado() { //Consultar todos los empleados
        return (ArrayList<EmpleadoEntity>) repository.findAll();
    }

    public Optional<EmpleadoEntity> buscarEmpleado(long id) {
        return repository.findById(id);
    }

    /*/public ArrayList<EmpleadoEntity> buscarPerfil(String profile){
        return repository.findByPerfil();
    }

    public ArrayList<EmpleadoEntity> buscarRol(String role){
        return repository.findByRol();*/

}
