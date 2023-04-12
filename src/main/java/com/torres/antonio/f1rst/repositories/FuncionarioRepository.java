package com.torres.antonio.f1rst.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.torres.antonio.f1rst.entities.Funcionario;

@Repository
public interface FuncionarioRepository extends MongoRepository <Funcionario, String> {
    
    Funcionario findByid(String id);
}
