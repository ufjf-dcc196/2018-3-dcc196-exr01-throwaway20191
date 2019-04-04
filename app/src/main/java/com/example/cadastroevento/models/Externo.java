package com.example.cadastroevento.models;

public class Externo extends Pessoa  {

    private String email;

    public Externo(String nome, String email) {
        super(nome);
        this.email = email;
    }
}
