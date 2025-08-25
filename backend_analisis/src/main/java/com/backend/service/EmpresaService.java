package com.backend.service;

import java.util.List;
import com.backend.model.entity.Empresa;

public interface EmpresaService {

    List<Empresa> findAll();

    Empresa findById(Integer id);

    Empresa create(Empresa e);

    Empresa update(Integer id, Empresa e);

    void delete(Integer id);
}