package com.example.ado01.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity(name = "Alunos")
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RA")
    int ra;
    
    @Column(name = "Nome")
    String nome;

    @Column(name = "CEP")
    String Cep;

    @Column(name = "Numero")
    int numero;

    @Column(name = "Complemento")
    String complemento;

    @Column(name = "notaAdo1")
    double notaAdo1;

    @Column(name = "notaPI")
    double notaPI;

    public Aluno() {
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String cep) {
        Cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public double getNotaAdo1() {
        return notaAdo1;
    }

    public void setNotaAdo1(double notaAdo1) {
        this.notaAdo1 = notaAdo1;
    }

    public double getNotaPI() {
        return notaPI;
    }

    public void setNotaPI(double notaPI) {
        this.notaPI = notaPI;
    }

    public Aluno(String nome, String cep, int numero, String complemento, double notaAdo1, double notaPI) {
        this.nome = nome;
        Cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.notaAdo1 = notaAdo1;
        this.notaPI = notaPI;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", Cep='" + Cep + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", notaAdo1=" + notaAdo1 +
                ", notaPI=" + notaPI +
                '}';
    }
}
