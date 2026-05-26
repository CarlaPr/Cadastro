package com.dio.cadastro.infrastructure.repository;

import com.dio.cadastro.infrastructure.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    //optional pois ele permite gerar uma exception caso o email nao seja encontrado
    //
    Optional<Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);

}
