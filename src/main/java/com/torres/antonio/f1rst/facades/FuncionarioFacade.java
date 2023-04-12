package com.torres.antonio.f1rst.facades;

import java.util.List;

import com.torres.antonio.f1rst.dtos.requests.FuncionarioRequestDTO;
import com.torres.antonio.f1rst.dtos.responses.FuncionarioResponseDTO;

public interface FuncionarioFacade {
    
    FuncionarioResponseDTO save(FuncionarioRequestDTO funcionarioRequestDTO);

    List<FuncionarioResponseDTO> findAll();

    FuncionarioResponseDTO findById(String id);

    FuncionarioResponseDTO update(FuncionarioRequestDTO funcionarioRequestDTO);

    void deleteFuncById(String id);
}
