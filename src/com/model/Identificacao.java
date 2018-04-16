/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author cleys
 */
public class Identificacao {

    private int id;
    private String nome;
    private String naturalidade;

    private Endereco endereco;
    private Telefone fixo;
    private Telefone celular;

    public Identificacao() {
    }

    public Identificacao(Builder builder) {
        this.id = builder.id;
        this.nome = builder.nome;
        this.naturalidade = builder.naturalidade;
        this.endereco = builder.endereco;
        this.fixo = builder.fixo;
        this.celular = builder.celular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getFixo() {
        return fixo;
    }

    public void setFixo(Telefone fixo) {
        this.fixo = fixo;
    }

    public Telefone getCelular() {
        return celular;
    }

    public void setCelular(Telefone celular) {
        this.celular = celular;
    }

    public static class Builder {

        private int id;
        private String nome;
        private String naturalidade;

        private Endereco endereco;
        private Telefone fixo;
        private Telefone celular;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setNaturalidade(String naturalidade) {
            this.naturalidade = naturalidade;
            return this;
        }

        public Builder setEndereco(Endereco endereco) {
            this.endereco = endereco;
            return this;
        }

        public Builder setFixo(Telefone fixo) {
            this.fixo = fixo;
            return this;
        }
        
        public Builder setCelular(Telefone celular) {
            this.celular = celular;
            return this;
        }

        public Identificacao build() {
            return new Identificacao(this);
        }
    }
}
