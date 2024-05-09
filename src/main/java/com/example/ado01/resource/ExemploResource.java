package com.example.ado01.resource;

import com.example.ado01.entities.Aluno;
import com.example.ado01.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/exemplo")
public class ExemploResource {

    @Autowired
    private DBService dbService;

    @GetMapping(value = "/{ra}")
    public ResponseEntity<Aluno> findByRA(@PathVariable Integer ra) {
        Aluno aluno = dbService.findByRA(ra);
        return ResponseEntity.ok().body(aluno);
    }

    @GetMapping
    public List<Aluno> listarTodos() {
        List<Aluno> alunos = dbService.listarTodos();
        return alunos;
    }

    @GetMapping(value = "nome/{nome}")
    public ResponseEntity<Aluno> findByNome (@PathVariable String nome) {
        Aluno aluno = dbService.findByNome(nome);
        return ResponseEntity.ok().body(aluno);
    }

    @PostMapping
    public ResponseEntity<Aluno> gravarAluno(@RequestBody Aluno aluno) {
        aluno = dbService.gravarAluno(aluno);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{ra}").buildAndExpand(aluno.getRa()).toUri();

        return ResponseEntity.created(uri).body(aluno);
    }

    @DeleteMapping(value = "/{ra}")
    public ResponseEntity<Void> deletar(@PathVariable Integer ra) {
        dbService.deletar(ra);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{ra}")
    public  ResponseEntity<Aluno> update(@PathVariable Integer ra, @RequestBody Aluno aluno) {
        Aluno alterado = dbService.update(ra, aluno);
        return ResponseEntity.ok().body(alterado);
    }
}
