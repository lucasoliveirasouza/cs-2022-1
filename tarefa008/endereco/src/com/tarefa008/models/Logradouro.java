package com.tarefa008.models;

import com.tarefa008.enums.TipoLogradouro;

public class Logradouro {
    private String nome;
    private TipoLogradouro tipoLogradouro;

    public Logradouro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }
}
