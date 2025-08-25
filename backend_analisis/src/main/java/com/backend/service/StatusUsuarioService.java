package com.backend.service;

import java.util.List;
import com.backend.model.entity.StatusUsuario;

public interface StatusUsuarioService {

    List<StatusUsuario> findAll();

    StatusUsuario findById(Integer id);

    StatusUsuario create(StatusUsuario t);

    StatusUsuario update(Integer id, StatusUsuario t);

    void delete(Integer id);

}
