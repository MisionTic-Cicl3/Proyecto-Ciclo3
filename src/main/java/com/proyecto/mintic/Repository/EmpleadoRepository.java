package com.proyecto.mintic.Repository;

import com.proyecto.mintic.entity.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Long> {

   // public ArrayList<EmpleadoEntity> buscarPerfil(String profile);
      // return repositorio.findByPerfil(profile);
}
