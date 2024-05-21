package org.demo.pc1_demo.usuario.domain;

import org.demo.pc1_demo.usuario.infrastructure.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void registrarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void actualizarUsuario(Long id,Usuario usuario) {
        Usuario usuarioActualizado = usuarioRepository.findById(id).get();
        usuarioActualizado.setNombres(usuario.getNombres());
        usuarioActualizado.setEmail(usuario.getEmail());
        usuarioActualizado.setPassword(usuario.getPassword());
        usuarioRepository.save(usuarioActualizado);
    }

    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
