package com.jpedro.API_Cert.services;

import com.jpedro.API_Cert.models.UsuarioAuthenticated;
import com.jpedro.API_Cert.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioDetailsServiceImp implements UserDetailsService {
    public final UsuarioRepository usuarioRepository;

    public UsuarioDetailsServiceImp(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usuarioRepository.findByUserName(username).map(UsuarioAuthenticated::new).orElseThrow(()-> new UsernameNotFoundException("Usuario nao encontrado"));
    }

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return usuarioRepository.findByUserName(username).map(UsuarioAuthenticated::new);
////        orElseThrow(()-> new UsernameNotFoundException("Usuario nao encontrado"));
//    }
}
