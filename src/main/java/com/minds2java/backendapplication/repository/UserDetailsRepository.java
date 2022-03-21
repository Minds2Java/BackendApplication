package com.minds2java.backendapplication.repository;

import com.minds2java.backendapplication.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDetailsRepository extends JpaRepository<User,Long> {
   Optional<User> findByUsername(String username);
   Boolean existsByUsername(String username);
   Boolean existsByEmail(String email);
}
