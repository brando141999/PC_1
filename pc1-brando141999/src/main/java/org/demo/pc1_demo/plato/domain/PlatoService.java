package org.demo.pc1_demo.plato.domain;

import org.demo.pc1_demo.plato.infrastructure.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatoService {
    @Autowired
    private PlatoRepository platoRepository;

    public List<Plato> listarPlatos() {
        return platoRepository.findAll();
    }

    public Plato obtenerPlato(Long id) {
        return platoRepository.findById(id).get();
    }

}
