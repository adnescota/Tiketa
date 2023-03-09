package com.Tiketa.tiketa.controller;

import com.Tiketa.tiketa.model.Caderno;
import com.Tiketa.tiketa.repository.CadernoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/caderno")
public class CadernoController {
    @Autowired
    private CadernoRepository cadernoRepository;
    @GetMapping
    public List <Caderno> Listar() { return cadernoRepository.findAll(); }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Caderno adicionar(@RequestBody Caderno caderno){return cadernoRepository.save(caderno);}

}
