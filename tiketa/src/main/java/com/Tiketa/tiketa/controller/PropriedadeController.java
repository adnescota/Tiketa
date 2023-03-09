package com.Tiketa.tiketa.controller;

import com.Tiketa.tiketa.model.Propriedade;
import com.Tiketa.tiketa.repository.LavouraRepository;
import com.Tiketa.tiketa.repository.PropriedadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/propriedade")
public class PropriedadeController {
    @Autowired
    private PropriedadeRepository propriedadeRepository;
    @GetMapping
    public List <Propriedade> Listar() {return propriedadeRepository.findAll();}
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Propriedade adicionar(@RequestBody Propriedade propriedade) {return propriedadeRepository.save(propriedade);}
}
