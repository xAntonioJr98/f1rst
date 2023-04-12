package com.torres.antonio.f1rst.configurations;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfigurations {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    
}
