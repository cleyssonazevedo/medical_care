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
public class Endereco {

    private String logradouro;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco() {
    }

    public Endereco(Builder builder) {
        this.logradouro = builder.logradouro;
        this.numero = builder.numero;
        this.cidade = builder.cidade;
        this.estado = builder.estado;
        this.cep = builder.cep;
    }
    
    
    
    

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public static class Builder {

        private String logradouro;
        private String numero;
        private String cidade;
        private String estado;
        private String cep;

        public Builder setLogradouro(String logradouro) {
            this.logradouro = logradouro;
            return this;
        }

        public Builder setNumero(String numero) {
            this.numero = numero;
            return this;
        }

        public Builder setCidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public Builder setEstado(String estado) {
            this.estado = estado;
            return this;
        }

        public Builder setCep(String cep) {
            this.cep = cep;
            return this;
        }
        
        public Endereco build() {
            return new Endereco(this);
        }

    }
}
