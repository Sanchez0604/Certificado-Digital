package com.jpedro.API_Cert.controller;

import com.jpedro.API_Cert.services.AuthService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("authenticate")
    public String authenticate(Authentication authentication){
        return authService.authenticate(authentication);
    }
}
