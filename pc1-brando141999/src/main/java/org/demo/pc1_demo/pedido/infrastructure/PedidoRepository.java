package org.demo.pc1_demo.pedido.infrastructure;

import org.demo.pc1_demo.pedido.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
