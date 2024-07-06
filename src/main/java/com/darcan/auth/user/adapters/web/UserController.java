package com.darcan.auth.user.adapters.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darcan.auth.user.application.UserService;
import com.darcan.auth.user.domain.User;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping    
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok(this.userService.getAll());
    }
}