package com.jpedro.API_Cert.controller;

import com.jpedro.API_Cert.models.Usuario;
import com.jpedro.API_Cert.repository.UsuarioRepository;
import com.jpedro.API_Cert.services.ChavesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ChavesService chavesService;

    @PostMapping("/criar")
    public Usuario criar(@RequestBody Usuario usuario) throws NoSuchAlgorithmException {
        // Gera o par de chaves
        KeyPair parChaves = chavesService.gerarParChaves();
        String publicKey = Base64.getEncoder().encodeToString(parChaves.getPublic().getEncoded());
        String privateKey = Base64.getEncoder().encodeToString(parChaves.getPrivate().getEncoded());
        // Define as chaves no objeto Usuario
        usuario.setPublicKey(publicKey);
        usuario.setPrivateKey(privateKey);
        // Salva o usuário no repositório
        return usuarioRepository.save(usuario);
    }

    @GetMapping
    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }
}