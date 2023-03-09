package com.Tiketa.tiketa.model;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name ="TB_PRODUTOR")
public class Usuario implements Serializable {
    public static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 200)
    private String name;
    @Column(nullable = false, length = 200)
    private String email;
    @Column(nullable = false, length = 200)
    private String password;

}
