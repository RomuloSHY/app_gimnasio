package com.proyecto.app_gimnasio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "membresia")
@Getter
@Setter
@NoArgsConstructor
public class Membresia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "precio", nullable = false)
    private BigDecimal precio;

    @Column(name = "duracion_meses", nullable = false)
    private Integer duracionMeses;
}
