package com.torres.antonio.f1rst.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torres.antonio.f1rst.entities.Funcionario;
import com.torres.antonio.f1rst.repositories.FuncionarioRepository;
import com.torres.antonio.f1rst.services.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService{


    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public Funcionario save(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    @Override
    public List<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }

    @Override
    public Funcionario findById(String id) {
        return funcionarioRepository.findByid(id);
    }

    @Override
    public void deleteFuncById(String id) {
        funcionarioRepository.deleteById(id);
    }

    
    
}
