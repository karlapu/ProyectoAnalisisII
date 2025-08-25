package com.backend.model.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.model.entity.Sucursal;

public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {

}