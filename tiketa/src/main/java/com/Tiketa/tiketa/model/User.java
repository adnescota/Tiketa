package com.Tiketa.tiketa.model;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String password;

}
