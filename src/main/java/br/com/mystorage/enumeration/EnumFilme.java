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
public enum EnumFilme {
    ACAO("Ação"),
    ANIMACAO("Animação"),
    AVENTURA("Aventura"),
    COMEDIA("Comedia"), 
    FANTASIA("Fantasia"),
    FAROESTE("Faroeste"),
    FICCAO_CIENTIFICA("Ficção Cientifica"),
    GUERRA("Guerra"),
    MUSICAL("Musical"),
    PORNOGRAFICOS("Porno"),
    ROMANCE("Romance"),
    SUSPENSE("Suspense"),
    TERROR("Terror"),
    TRAGEDIA("Tragedia"),
    DRAMA("Drama");

    private String nome;

    EnumFilme(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
