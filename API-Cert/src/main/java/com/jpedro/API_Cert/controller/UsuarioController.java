package com.jpedro.API_Cert.controller;

import com.jpedro.API_Cert.models.Usuario;
import com.jpedro.API_Cert.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @PostMapping
    public Usuario criar (@RequestBody Usuario usuario) {
        return UsuarioRepository.save(usuario);
    }
}
