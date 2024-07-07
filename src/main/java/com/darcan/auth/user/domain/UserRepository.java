package com.darcan.auth.user.domain;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, UUID>{ 
    Optional<User> findByName(String username);  
}
