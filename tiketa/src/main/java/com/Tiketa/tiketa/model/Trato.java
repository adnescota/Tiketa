package com.Tiketa.tiketa.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Trato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String tipo;
    @Column
    private String data;
}
