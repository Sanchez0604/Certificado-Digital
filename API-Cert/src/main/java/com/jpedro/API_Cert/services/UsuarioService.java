package com.jpedro.API_Cert.services;
import com.jpedro.API_Cert.models.Usuario;
import com.jpedro.API_Cert.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

@Service
public class UsuarioService {

    //Instancia o ChavesService
    @Autowired
    private ChavesService chavesService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Usa o ChavesService para gerar um par de chaves quando um novo usuário for criado
//    public Usuario criarChaves(Usuario usuario) throws NoSuchAlgorithmException {
//        KeyPair parChaves = chavesService.gerarParChaves();
//        usuario.setPublicKey(Base64.getEncoder().encodeToString(parChaves.getPublic().getEncoded()));
//        usuario.setPrivateKey(Base64.getEncoder().encodeToString(parChaves.getPrivate().getEncoded()));
//        return usuarioRepository.save(usuario);
//    }
}

