package com.jpedro.API_Cert.models;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class UsuarioAuthenticated implements UserDetails {
    private final Usuario usuario;
    public UsuarioAuthenticated(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(()-> "ROLE_USUARIO");
    }

    @Override
    public String getPassword() {
        return usuario.getPwd();
    }

    @Override
    public String getUsername() {
        return usuario.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
