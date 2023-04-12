package com.torres.antonio.f1rst.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.torres.antonio.f1rst.dtos.requests.FuncionarioRequestDTO;
import com.torres.antonio.f1rst.dtos.responses.FuncionarioResponseDTO;
import com.torres.antonio.f1rst.facades.FuncionarioFacade;

@RestController
@RequestMapping("/api/v1/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioFacade funcionarioFacade;


    @PostMapping("/create")
    public ResponseEntity<FuncionarioResponseDTO> createFuncionario(@RequestBody FuncionarioRequestDTO funcionarioRequestDTO){
        return new ResponseEntity<>(funcionarioFacade.save(funcionarioRequestDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<FuncionarioResponseDTO>> findAll(){
        return new ResponseEntity<>(funcionarioFacade.findAll(), HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<FuncionarioResponseDTO> getById(@PathVariable String id){
        return new ResponseEntity<>(funcionarioFacade.findById(id), HttpStatus.OK);

    }

    @PutMapping("/atualizar")
    public ResponseEntity<FuncionarioResponseDTO> update(@RequestBody FuncionarioRequestDTO funcionarioRequestDTO){
        
        return new ResponseEntity<>(funcionarioFacade.update(funcionarioRequestDTO), HttpStatus.OK);

    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarClientePorId(@PathVariable String id) {
        funcionarioFacade.deleteFuncById(id);
        return new ResponseEntity<>("Cliente deletado com sucesso", HttpStatus.OK);
    }
}
