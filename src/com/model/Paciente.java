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
public class Paciente {
    private final Long id;
    private final String nome;
    private final String sexo;
    private final String cpf;

    private Paciente(Builder builder) {
        this.id = builder.id;
        this.nome = builder.nome;
        this.sexo = builder.sexo;
        this.cpf = builder.cpf;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public static class Builder {

        private Long id;
        private String nome;
        private String sexo;
        private String cpf;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setSexo(String sexo) {
            this.sexo = sexo;
            return this;
        }

        public Builder setCPF(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Paciente build() {
            return new Paciente(this);
        }
    }
}
