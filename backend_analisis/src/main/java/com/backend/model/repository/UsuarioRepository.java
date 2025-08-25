package com.backend.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}