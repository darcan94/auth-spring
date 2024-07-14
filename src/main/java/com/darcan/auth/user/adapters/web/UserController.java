package com.darcan.auth.user.adapters.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darcan.auth.user.application.UserService;
import com.darcan.auth.user.domain.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{name}")    
    public ResponseEntity<Optional<UserEntity>> getUser(@PathVariable String name){
        return ResponseEntity.ok(this.userService.findByName(name));
    }
}
