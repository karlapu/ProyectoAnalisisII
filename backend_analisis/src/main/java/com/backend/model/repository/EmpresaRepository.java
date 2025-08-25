package com.backend.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.model.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

}