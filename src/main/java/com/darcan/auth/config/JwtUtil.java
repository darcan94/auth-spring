package com.darcan.auth.config;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

@Component
public class JwtUtil {
    private static String SECRET_KEY = "darcan";
    private static Algorithm ALGORITHM = Algorithm.HMAC256(SECRET_KEY);
    
    public String create(String username){
        return JWT.create()
                  .withSubject(username)
                  .withIssuer("auth")
                  .withIssuedAt(new Date())
                  .withExpiresAt(new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(15)))
                  .sign(ALGORITHM);
    }
}
