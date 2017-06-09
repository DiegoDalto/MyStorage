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
public enum TipoItem {
    GAME("Game"),
    FILME("Filme"),
    LIVRO("Livro");
    
    private String nome;

    TipoItem(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
