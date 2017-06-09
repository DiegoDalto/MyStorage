/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.bean;

import br.com.mystorage.enumeration.EnumGame;

/**
 *
 * @author Diego
 */
public class Game extends Item{
      private EnumGame genero;

    public EnumGame getGenero() {
        return genero;
    }

    public void setGenero(EnumGame genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Game{" + "genero=" + genero + '}';
    }
}
