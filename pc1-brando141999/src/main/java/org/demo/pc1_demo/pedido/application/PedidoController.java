package org.demo.pc1_demo.pedido.application;


import org.demo.pc1_demo.pedido.domain.Pedido;
import org.demo.pc1_demo.pedido.domain.PedidoService;
import org.demo.pc1_demo.plato.domain.Plato;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private PedidoService pedidoService;

    @PostMapping("/registrar")
    public ResponseEntity<Void> registrarPedido(@RequestBody Pedido pedido) {
        pedidoService.registrarPedido(pedido);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<List<Plato>> listarPedidos(@PathVariable Long id) {
        List<Plato> platos = pedidoService.listarPedidos(id);
        return ResponseEntity.ok(platos);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> eliminarPedido(@PathVariable Long id) {
        pedidoService.eliminarPedido(id);
        return ResponseEntity.ok().build();
    }

}
