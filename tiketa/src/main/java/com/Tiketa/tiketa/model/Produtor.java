package com.Tiketa.tiketa.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name ="TB_PRODUTOR")
public class Produtor {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int")
    private Long id;
    @Column(nullable = false, length = 150)
    private String nome;
    @Column(nullable = false, length = 150)
    private String email;
    @Column(nullable = false, length = 15)
    private String telefone;
    @Column(nullable = false, length = 14)
    private String cpf;

}
