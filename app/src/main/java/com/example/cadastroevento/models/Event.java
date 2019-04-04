package com.example.cadastroevento.models;

import java.util.ArrayList;
import java.util.List;

public class Event {


    public List<Aluno> alunos;
    public List<Externo> externos;
    public List<Servidor> servidores;

    public Event() {
        this.alunos = new ArrayList<>();
        this.externos = new ArrayList<>();
        this.servidores = new ArrayList<>();
    }
}
