package com.backend.service;

import java.util.List;
import com.backend.model.entity.Role;

public interface RoleService {

    List<Role> findAll();

    Role findById(Integer id);

    Role create(Role r);

    Role update(Integer id, Role r);

    void delete(Integer id);

}
