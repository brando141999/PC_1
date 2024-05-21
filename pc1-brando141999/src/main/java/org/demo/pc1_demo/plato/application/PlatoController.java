package org.demo.pc1_demo.plato.application;

import org.demo.pc1_demo.plato.domain.Plato;
import org.demo.pc1_demo.plato.domain.PlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/platos")
public class PlatoController {
    @Autowired
    private PlatoService platoService;

    @GetMapping
    public ResponseEntity<List<Plato>> listarPlatos() {
        List<Plato> platos = platoService.listarPlatos();
        return ResponseEntity.ok(platos);
    }

    @GetMapping("{id}")
    public ResponseEntity<Plato> obtenerPlato(Long id) {
        Plato plato = platoService.obtenerPlato(id);
        return ResponseEntity.ok(plato);
    }

}
