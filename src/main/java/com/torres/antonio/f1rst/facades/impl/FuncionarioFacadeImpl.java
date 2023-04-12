package com.torres.antonio.f1rst.facades.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.torres.antonio.f1rst.dtos.requests.FuncionarioRequestDTO;
import com.torres.antonio.f1rst.dtos.responses.FuncionarioResponseDTO;
import com.torres.antonio.f1rst.entities.Funcionario;
import com.torres.antonio.f1rst.facades.FuncionarioFacade;
import com.torres.antonio.f1rst.services.FuncionarioService;

@Component
public class FuncionarioFacadeImpl implements FuncionarioFacade {


    @Autowired
    private FuncionarioService funcionarioService;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public FuncionarioResponseDTO save(FuncionarioRequestDTO funcionarioRequestDTO) {
        return convertToDTO(funcionarioService.save(convertToEntity(funcionarioRequestDTO)));
    }

    @Override
    public List<FuncionarioResponseDTO> findAll() {
        List<FuncionarioResponseDTO> funcionariosList = new ArrayList<>();

        for (Funcionario funcionario : funcionarioService.findAll()) {
            funcionariosList.add(convertToDTO(funcionario));
            
        }
        return funcionariosList;
    }

    @Override
    public FuncionarioResponseDTO findById(String id) {
        return convertToDTO(funcionarioService.findById(id));
    
        
    }

    @Override
    public void deleteFuncById(String id) {
        funcionarioService.deleteFuncById(id);
    }

    @Override
    public FuncionarioResponseDTO update(FuncionarioRequestDTO funcionarioRequestDTO) {
        return convertToDTO(funcionarioService.save(convertToEntity(funcionarioRequestDTO)));
    }


    private Funcionario convertToEntity(FuncionarioRequestDTO funcionarioRequestDTO){

        return modelMapper.map(funcionarioRequestDTO, Funcionario.class);


    }

    private FuncionarioResponseDTO convertToDTO(Funcionario funcionario){

        return modelMapper.map(funcionario, FuncionarioResponseDTO.class);

    }

   

    

   

   


    
}
