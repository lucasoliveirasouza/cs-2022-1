package com.tarefa008.models;

import java.util.ArrayList;
import java.util.Date;
/**
 * Classe de pessoa física
 * Autor: Lucas Oliveira de Souza
 * Data: 15/07/2022
 */
public class PessoaFisica {


    private String nome;
    private String sexo;
    private Date dataNascimento;
    private ArrayList<Endereco> endereco;

    public PessoaFisica(String nome, String sexo, Date dataNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(ArrayList<Endereco> endereco) {
        this.endereco = endereco;
    }
}
