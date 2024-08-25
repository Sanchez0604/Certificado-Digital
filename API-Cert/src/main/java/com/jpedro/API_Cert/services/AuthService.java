package com.jpedro.API_Cert.services;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public final JwtService jwtService;
    public AuthService(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    public String authenticate(Authentication authentication){
        return jwtService.generateToken(authentication);
    }
}
