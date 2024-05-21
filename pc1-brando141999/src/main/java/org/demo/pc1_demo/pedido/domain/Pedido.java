package org.demo.pc1_demo.pedido.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.demo.pc1_demo.plato.domain.Plato;
import org.demo.pc1_demo.usuario.domain.Usuario;

import java.util.*;


@Data
@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "pedido_plato",
            joinColumns = @JoinColumn(name = "pedido_id"),
            inverseJoinColumns = @JoinColumn(name = "plato_id")
    )
    private List<Plato> platos;
}

