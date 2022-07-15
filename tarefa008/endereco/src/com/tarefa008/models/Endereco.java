package com.tarefa008.models;

import com.tarefa008.enums.TipoEndereco;

/**
 * Classe de bairro;
 * Autor: Lucas Oliveira de Souza;
 * Data: 15/07/2022;
 */
public class Endereco {
    private int numero;
    private String complemento;
    private int cep;

    /**
     * Relacionamento com bairro
     */
    private Bairro bairro;

    /**
     * Relacionamento com logradouro
     */
    private Logradouro logadouro;
    private TipoEndereco tipoEndereco;


    public Endereco(int numero, String complemento, int cep) {
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
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

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Logradouro getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(Logradouro logadouro) {
        this.logadouro = logadouro;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }
}
