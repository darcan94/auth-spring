package com.darcan.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
            .authorizeHttpRequests(customizeRequests -> {
                customizeRequests
                    .anyRequest()
                    .authenticated();
            })
            .csrf(AbstractHttpConfigurer::disable)
            .httpBasic(Customizer.withDefaults());
            
        return http.build();
    }
}
