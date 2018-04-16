/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.enums;

/**
 *
 * @author cleys
 */
public enum TipoTelefone {
    FIXO(0),
    CELULAR(1);

    private final int tipo;

    TipoTelefone(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return this.tipo;
    }

    public static TipoTelefone setTipo(int tipo) throws Exception {
        switch (tipo) {
            case 0:
                return TipoTelefone.FIXO;
            case 1:
                return TipoTelefone.CELULAR;
            default:
                throw new Exception("Tipo Inválido");
        }
    }
}
