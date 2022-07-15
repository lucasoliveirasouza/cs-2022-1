package com.tarefa008.models;


/**
 * Classe de bairro;
 * Autor: Lucas Oliveira de Souza;
 * Data: 15/07/2022;
 */
public class Bairro {

    private String nome;

    /**
     * Relacionamento com Cidade
     */
    private Cidade cidade;

    public Bairro(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
