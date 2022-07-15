package com.tarefa008.models;

/**
 * Classe de estado;
 * Autor: Lucas Oliveira de Souza;
 * Data: 15/07/2022;
 */
public class Estado {
    private String sigla;
    private String nome;

    /**
     * Relacionamento com pais
     */
    private Pais pais;

    public Estado(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
