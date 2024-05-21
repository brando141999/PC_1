package org.demo.pc1_demo.pedido.domain;

import org.demo.pc1_demo.pedido.infrastructure.PedidoRepository;
import org.demo.pc1_demo.plato.domain.Plato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public void registrarPedido(Pedido pedido) {
        pedidoRepository.save(pedido);
    }

    public List<Plato> listarPedidos(Long id) {
        return pedidoRepository.findById(id).get().getPlatos();
    }

    public void eliminarPedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}
