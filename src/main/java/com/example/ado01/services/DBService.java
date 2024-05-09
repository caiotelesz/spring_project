package com.example.ado01.services;

import com.example.ado01.entities.Aluno;
import com.example.ado01.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@Service
public class DBService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno findByRA(Integer ra) {
        Optional<Aluno> aluno = alunoRepository.findById(ra);
        return aluno.orElse(null);
    }

    public List<Aluno> listarTodos() {
        List<Aluno> aluno = alunoRepository.findAll();
        return aluno;
    }

    public Aluno findByNome(String nome) {
        Optional<Aluno> aluno = alunoRepository.findByNome(nome);
        return aluno.orElse(null);
    }

    public Aluno gravarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public void deletar(Integer ra) {
        alunoRepository.deleteById(ra);
    }

    public Aluno update(Integer ra, Aluno aluno) {
        Aluno alterado = findByRA(ra);
        if (alterado != null) {
            alterado.setNome(aluno.getNome());
            alterado.setCep(aluno.getCep());
            alterado.setNumero(aluno.getNumero());
            alterado.setComplemento(aluno.getComplemento());
            alterado.setNotaAdo1(aluno.getNotaPI());
            alterado.setNotaPI(aluno.getNotaPI());
            return alunoRepository.save(alterado);
        }
        return null;
    }
}
