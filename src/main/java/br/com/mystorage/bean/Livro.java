/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.bean;

import br.com.mystorage.enumeration.EnumLivro;

/**
 *
 * @author Diego
 */
public class Livro extends Item {
        private EnumLivro genero;

    public EnumLivro getGenero() {
        return genero;
    }

    public void setGenero(EnumLivro genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro{" + "genero=" + genero + '}';
    }
}
