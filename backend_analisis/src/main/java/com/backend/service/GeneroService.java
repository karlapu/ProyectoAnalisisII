package com.backend.service;

import java.util.List;
import com.backend.model.entity.Genero;

public interface GeneroService {

    List<Genero> findAll();

    Genero findById(Integer id);

    Genero create(Genero g);

    Genero update(Integer id, Genero g);

    void delete(Integer id);
}