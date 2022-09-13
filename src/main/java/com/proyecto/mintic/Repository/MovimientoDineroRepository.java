package com.proyecto.mintic.Repository;

import com.proyecto.mintic.entity.MovimientoDineroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface MovimientoDineroRepository extends JpaRepository<MovimientoDineroEntity, Long> {

    ArrayList<MovimientoDineroEntity> findByEmpresad(String empresad);

}
