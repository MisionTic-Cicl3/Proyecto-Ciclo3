package com.proyecto.mintic.service;

import com.proyecto.mintic.Repository.EmpleadoRepository;
import com.proyecto.mintic.entity.EmpleadoEntity;
import com.proyecto.mintic.entity.MovimientoDineroEntity;
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

    public String agregarEmpleado(EmpleadoEntity Empleado) {
        if (!buscarEmpleado(Empleado.getId()).isPresent()) {
            repository.save(Empleado);
            return "Empleado registrado";
        }else {
            return "Empleado ya existe";
        }
    }

    public String actualizarEmpleado(EmpleadoEntity Empleado){
        if (buscarEmpleado(Empleado.getId()).isPresent()){
            repository.save(Empleado);
            return "Empleado actualizado";
        }else {
            return "El empleado no existe";
        }
    }

    public String eliminarEmpleado(long id){
        if (buscarEmpleado(id).isPresent()){
            repository.deleteById(id);
            return "Empleado eliminado";
        }else {
            return "Empleado a eliminar no existe";
        }
    }
}