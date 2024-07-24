package com.darcan.auth.user.adapters.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import java.util.Optional;

import com.darcan.auth.user.application.UserService;
//import com.darcan.auth.user.domain.UserEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{name}")    
    public ResponseEntity<UserDetails> getUser(@PathVariable String name){
        return ResponseEntity.ok(this.userService.loadUserByUsername(name));
    }

    /*@GetMapping("/user/{email}")    
    public ResponseEntity<Optional<UserEntity>> getUserByEmail(@PathVariable String email){
        return ResponseEntity.ok(this.userService.findByEmail(email));
    }*/
}
