package com.jpedro.API_Cert.repository;

import com.jpedro.API_Cert.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
