/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.bean;

import br.com.mystorage.enumeration.EnumFilme;

/**
 *
 * @author Diego
 */
public class Filme extends Item{
    private EnumFilme genero;

    public EnumFilme getGenero() {
        return genero;
    }

    public void setGenero(EnumFilme genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Filme{" + "genero=" + genero + '}';
    }
}
