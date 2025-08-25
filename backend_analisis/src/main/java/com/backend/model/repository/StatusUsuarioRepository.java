package com.backend.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.model.entity.StatusUsuario;

public interface StatusUsuarioRepository extends JpaRepository<StatusUsuario, Integer> {
}