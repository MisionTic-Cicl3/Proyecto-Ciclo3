package com.proyecto.mintic.Repository;
import com.proyecto.mintic.entity.EmpresaEntity;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface EmpresaRepository extends JpaRepository<EmpresaEntity, Long> {

    ArrayList<EmpresaEntity> findByDocument(String documento);

}
