package com.example.ado01.services;

import com.example.ado01.entities.Aluno;
import com.example.ado01.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MyNameService {
    @Autowired
    private AlunoRepository alunoRepository;
    @Bean
    public void instanciarDB() {
        Aluno aluno1 = new Aluno("Caio Teles dos Santos", "01002324-00", 212, "apto 23", 10.0, 10.0);
        alunoRepository.saveAll(Arrays.asList(aluno1));
    }
}
