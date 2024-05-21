package org.demo.pc1_demo.usuario.application;

import org.demo.pc1_demo.usuario.domain.Usuario;
import org.demo.pc1_demo.usuario.domain.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Void> registrarUsuario(@RequestBody Usuario usuario) {
        usuarioService.registrarUsuario(usuario);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/actualizar/{id}")
    public ResponseEntity<Void> actualizarUsuario(@RequestParam Long id, @RequestBody Usuario usuario) {
        usuarioService.actualizarUsuario(id, usuario);
        return ResponseEntity.ok().build();
    }

}
