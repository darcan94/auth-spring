package com.darcan.auth.user.domain;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, UUID>{ 
    Optional<UserEntity> findByEmail(String email);  
    Optional<UserEntity> findByName(String username);  
}
