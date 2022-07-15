package com.tarefa008.models;

/**
 * Classe de cidade;
 * Autor: Lucas Oliveira de Souza;
 * Data: 15/07/2022;
 */
public class Cidade {
    private String nome;

    /**
     * Relacionamento com Estado
     */
    private Estado estado;


    public Cidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
