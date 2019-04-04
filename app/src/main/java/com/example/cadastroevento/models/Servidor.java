package com.example.cadastroevento.models;

public class Servidor extends Pessoa {

    private String siape;

    public Servidor(String nome, String siape) {
        super(nome);
        this.siape = siape;
    }
}
