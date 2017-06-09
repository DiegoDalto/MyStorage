/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.enumeration;

/**
 *
 * @author Diego
 */
public enum TipoTelefone {
   CELULAR("Celular"), FIXO("Fixo"), COMERCIAL("Comercial");
   
   private String nome;

    TipoTelefone(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
