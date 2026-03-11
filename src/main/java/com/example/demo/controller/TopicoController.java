package com.example.demo.controller;

import com.example.demo.domain.topico.TopicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;


    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity eliminar(@PathVariable Long id) {
        var topicoOptional = repository.findById(id);

        if (!topicoOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}