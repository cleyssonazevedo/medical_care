/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.model.enums.TipoTelefone;

/**
 *
 * @author cleys
 */
public class Telefone {

    private String numero;
    private TipoTelefone tipo;

    public Telefone() { }
    
    public Telefone(Builder builder) {
        this.numero = builder.numero;
        this.tipo = builder.tipo;
    }
    
    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefone tipo) {
        this.tipo = tipo;
    }
    
    public static class Builder {
        private String numero;
        private TipoTelefone tipo;
        
        public Builder setNumero(String numero) {
            this.numero = numero;
            return this;
        }
        
        public Builder setTipo(TipoTelefone tipo) {
            this.tipo = tipo;
            return this;
        }
        
        public Telefone build() {
            return new Telefone(this);
        }
    }
}
