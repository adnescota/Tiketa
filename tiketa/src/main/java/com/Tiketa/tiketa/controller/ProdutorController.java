package com.Tiketa.tiketa.controller;

import com.Tiketa.tiketa.model.Produtor;
import com.Tiketa.tiketa.repository.ProdutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtor")
public class ProdutorController {
    @Autowired
    private ProdutorRepository produtorRepository;

    @GetMapping
    public List <Produtor> Listar(){
        return produtorRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produtor adicionar(@RequestBody Produtor produtor) {
        return produtorRepository.save(produtor);
    }
}
