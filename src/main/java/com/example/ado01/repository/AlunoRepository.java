package com.example.ado01.repository;

import com.example.ado01.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    @Query("SELECT alunos FROM Alunos alunos "
             +  "WHERE alunos.ra!=null ORDER BY alunos.nome" )
    List<Aluno> listarAlunosComRA();

    @Query("SELECT alunos FROM Alunos alunos "
            +   "WHERE alunos.ra=null ORDER BY alunos.nome" )
    List<Aluno> listarAluosSemRA();

    Optional<Aluno> findByNome(String nome);
}
