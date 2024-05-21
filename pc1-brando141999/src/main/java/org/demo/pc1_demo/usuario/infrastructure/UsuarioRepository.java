package org.demo.pc1_demo.usuario.infrastructure;

import org.demo.pc1_demo.usuario.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

}
