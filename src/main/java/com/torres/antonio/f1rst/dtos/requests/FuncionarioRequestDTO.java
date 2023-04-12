package com.torres.antonio.f1rst.dtos.requests;

import lombok.Data;

@Data
public class FuncionarioRequestDTO {

    private String id;
    private String nome;
    private String designacao;
    private String salario;
    private String numeroTelefone;
    private String endereco;
    
}
