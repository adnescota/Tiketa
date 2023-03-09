package com.Tiketa.tiketa.controller;

import com.Tiketa.tiketa.model.Lavoura;
import com.Tiketa.tiketa.repository.LavouraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lavoura")
public class LavouraController {
    @Autowired
    private LavouraRepository lavouraRepository;
    @GetMapping
    public List<Lavoura> Listar() {return lavouraRepository.findAll();}
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Lavoura adicionar(@RequestBody Lavoura  lavoura) {return lavouraRepository.save(lavoura);}

  }
