package com.jpedro.API_Cert.controller;

import com.jpedro.API_Cert.models.Usuario;
import com.jpedro.API_Cert.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @PostMapping
    public Usuario criar (@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
