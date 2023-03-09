package com.Tiketa.tiketa.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name ="TB_PROPRIEDADE")
public class Propriedade {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String nome;
    @Column(nullable = false, length = 20)
    private String inscricao;
    @Column(nullable = false, length = 10)
    private String cep;
    @Column(nullable = false, length = 200)
    private String endereco;
    @Column(nullable = false, length = 100)
    private String distrito;
    @Column(nullable = false, length = 50)
    private String cidade;
    @Column(nullable = false, length = 2)
    private String uf;

}
