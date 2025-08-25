package com.backend.serviceImp;

import java.util.List;
import org.springframework.stereotype.Service;
import com.backend.model.entity.StatusUsuario;
import com.backend.model.repository.StatusUsuarioRepository;
import com.backend.model.service.StatusUsuarioService;

@Service
public class StatusUsuarioServiceImp implements StatusUsuarioService {

    private final StatusUsuarioRepository repository;

    public StatusUsuarioServiceImp(StatusUsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<StatusUsuario> findAll() {
        return repository.findAll();
    }

    @Override
    public StatusUsuario findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public StatusUsuario create(StatusUsuario s) {
        return repository.save(s);
    }

    @Override
    public StatusUsuario update(Integer id, StatusUsuario s) {
        StatusUsuario statusDb = repository.findById(id).orElse(null);
        if (statusDb != null) {
            statusDb.setNombre(s.getNombre());
            return repository.save(statusDb);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
