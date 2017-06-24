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
public enum EnumGame {
   ACAO("Ação"),
   AVENTURA("Aventura"),
   RPG("RPG"),
   ESPORTES("Esportes"),
   CORRIDA("Corrida"),
   PLATAFORMA("Plataforma"),
   LUTA("Luta"),
   MUSICA(""),
   RITMICO("Rítmico"),
   ESTRATEGIA("Estratégia"),
   TIRO("Tiro"),
   PUZZLE("Puzzle"),
   TERROR("Terror"),
   MMORPG("MMORPG");
   
    private String nome;

    EnumGame(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
