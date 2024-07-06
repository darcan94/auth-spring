package com.darcan.auth.user.domain;

import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<User, UUID>{
    
}
