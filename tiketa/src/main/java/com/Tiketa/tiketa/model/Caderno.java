package com.Tiketa.tiketa.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name ="TB_CADERNO")
public class Caderno {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    @Column (nullable = false)
    private Date dia;
}
