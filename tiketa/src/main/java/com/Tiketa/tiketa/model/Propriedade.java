package com.Tiketa.tiketa.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Propriedade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    private String inscricao;
    @Column
    private String cep;
    @Column
    private String endereco;
    @Column
    private String distrito;
    @Column
    private String cidade;
    @Column
    private String estado;

}
