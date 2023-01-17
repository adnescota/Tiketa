package com.Tiketa.tiketa.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Produtor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int")
    private Long id;
    @Column
    private String nome;
    @Column

    private String email;
    @Column
    private String telefone;
    @Column
    private String cpf;

}
