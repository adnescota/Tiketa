package com.Tiketa.tiketa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Caderno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
