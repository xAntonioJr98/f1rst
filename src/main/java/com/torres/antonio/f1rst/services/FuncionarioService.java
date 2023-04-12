package com.torres.antonio.f1rst.services;

import java.util.List;

import com.torres.antonio.f1rst.entities.Funcionario;

public interface FuncionarioService {
    Funcionario save(Funcionario funcionario);
    List<Funcionario> findAll();
    Funcionario findById(String id);
    void deleteFuncById(String id);
    
}
