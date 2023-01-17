package com.Tiketa.tiketa.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity

public class Caderno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Date dia;
}
