package com.proyecto.mintic.service;


import com.proyecto.mintic.Repository.MovimientoDineroRepository;
import com.proyecto.mintic.entity.MovimientoDineroEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MovimientoDineroService {

    private MovimientoDineroRepository repository;

    public MovimientoDineroService(MovimientoDineroRepository repository) {
        this.repository = repository;
    }

    public ArrayList<MovimientoDineroEntity> listarDinero(){
        return (ArrayList<MovimientoDineroEntity>) repository.findAll();
    }

    public Optional<MovimientoDineroEntity> buscarDinero(long id){
        return repository.findById(id);
    }

    public ArrayList<MovimientoDineroEntity> buscarEmpresad(String empresad){
        return repository.findByEmpresad(empresad);
    }

    public String agregarDinero(MovimientoDineroEntity movimientoDinero) {
        if (!buscarDinero(movimientoDinero.getId()).isPresent()) {
            repository.save(movimientoDinero);
            return "Movimiento de dinero registrado";
        }else {
            return "Movmiviento ya existe";
        }
    }

    public String actualizarDinero(MovimientoDineroEntity movimientoDinero){
        if (buscarDinero(movimientoDinero.getId()).isPresent()){
            repository.save(movimientoDinero);
            return "Movimiento actualizado";
        }else {
            return "El movimiento solicitado no existe";
        }
    }

    public String eliminarDinero(long id){
        if (buscarDinero(id).isPresent()){
            repository.deleteById(id);
            return "Movimiento de dinero eliminado";
        }else {
            return "Movimiento a eliminar no existe";
        }
    }

}
