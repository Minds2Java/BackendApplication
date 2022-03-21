package com.minds2java.backendapplication.repository;

import com.minds2java.backendapplication.entities.Role;
import com.minds2java.backendapplication.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);
}
