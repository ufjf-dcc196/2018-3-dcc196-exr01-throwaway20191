package com.example.cadastroevento.models;

public class Aluno extends Pessoa  {

    private String matricula;

    public Aluno(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }
}
