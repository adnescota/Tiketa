package com.Tiketa.tiketa.model;

import com.Tiketa.tiketa.enums.Produto;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name ="TB_LAVOURA")
public class Lavoura {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 200)
    private String nomeLavoura;
    @Column
    @Enumerated(EnumType.STRING)
    private Produto produto;


}
