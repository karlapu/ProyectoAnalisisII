
package com.backend.model.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.model.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}