package com.darcan.auth.user.application;

import lombok.Data;

@Data
public class LoginDto {
    private String username;
    private String password;
}
