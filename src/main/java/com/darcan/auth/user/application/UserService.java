package com.darcan.auth.user.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darcan.auth.user.domain.User;
import com.darcan.auth.user.domain.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        return this.userRepository.findAll();
    }
}
