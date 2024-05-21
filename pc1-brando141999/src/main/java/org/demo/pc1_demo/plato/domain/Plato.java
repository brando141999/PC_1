package org.demo.pc1_demo.plato.domain;


import jakarta.persistence.*;
import lombok.Data;
import org.demo.pc1_demo.pedido.domain.Pedido;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "platos")
public class Plato {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nombre;
        private Double precio;

        @ManyToMany(mappedBy = "platos")
        private List<Pedido> pedidos;
}
