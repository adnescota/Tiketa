package com.Tiketa.tiketa.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Lavoura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nomeLavoura;
    @Column
    private Enum ProdutoEnum;


}
