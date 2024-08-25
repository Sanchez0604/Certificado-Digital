package com.jpedro.API_Cert.repository;

import com.jpedro.API_Cert.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    Optional<Usuario> findByUserName(String userName);
}
