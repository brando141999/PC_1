package org.demo.pc1_demo.usuario.domain;


import jakarta.persistence.*;
import lombok.Data;
import org.demo.pc1_demo.pedido.domain.Pedido;
import org.hibernate.annotations.Columns;
import org.hibernate.annotations.ManyToAny;

import java.util.ArrayList;
import java.util.List;



    @Data
    @Entity
    public class Usuario {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nombreDeUsuario;
        private String nombres;
        private String email;
        private String password;
        private int edad;

        @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
        private List<Pedido> pedidos;
    }



