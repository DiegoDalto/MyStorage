/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.bean;

import br.com.mystorage.enumeration.TipoTelefone;
import java.util.Objects;

/**
 *
 * @author Diego
 */
public class Telefone extends Bean<Long> {

    private String numero;
    private TipoTelefone tipo;

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

    @Override
    public String toString() {
        return "Telefone{" + ", numero=" + numero + ", tipo=" + tipo + '}';
    }
}
