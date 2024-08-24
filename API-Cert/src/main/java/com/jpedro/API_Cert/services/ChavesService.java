package com.jpedro.API_Cert.services;

import org.springframework.stereotype.Service;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

@Service
public class ChavesService{

    public KeyPair gerarParChaves() throws NoSuchAlgorithmException {
        KeyPairGenerator chaveGerada = KeyPairGenerator.getInstance("RSA");
        chaveGerada.initialize(2048);
        return chaveGerada.generateKeyPair();
    }
}

