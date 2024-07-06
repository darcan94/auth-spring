package com.darcan.auth.user.domain;

import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<User, String>{   
}
