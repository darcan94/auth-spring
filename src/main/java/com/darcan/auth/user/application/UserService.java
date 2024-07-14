package com.darcan.auth.user.application;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.darcan.auth.user.domain.UserEntity;
import com.darcan.auth.user.domain.UserRepository;

@Service
public class UserService implements UserDetailsService{
    
    @Autowired
    private UserRepository userRepository;

    public Optional<UserEntity> findByName(String name){
        return this.userRepository.findByName(name);
    }

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        UserEntity userEntity = this.userRepository.findByName(name)
                    .orElseThrow(() -> new UsernameNotFoundException("User " + name + " not found."));
        
        return User.builder()
                    .username(userEntity.getName())
                    .password(userEntity.getPassword())
                    .roles("ADMIN")
                    .build();
    }
}
