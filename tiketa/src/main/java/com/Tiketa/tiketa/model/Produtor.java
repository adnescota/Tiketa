package com.Tiketa.tiketa.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


public class Produtor implements Serializable {
   // private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int")
    private Long id;
    @Column(nullable = false, length = 150)
    private String nome;
    @Column(nullable = false, length = 200)
    private String email;
    @Column(nullable = true, length = 13)
    private String telefone;
    @Column(nullable = false, length = 14)
    private String cpf;

}
