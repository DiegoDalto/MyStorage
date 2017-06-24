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
public enum EnumLivro {
   AUTO_AJUDA("Auto Ajuda"),
   CIENCIA("Ciência"),
   CULINARIA("Culinária"),
   GASTRONOMIA("Gastronomia"),
   ESOTERISMO("Esoterismo"),
   FANTASIA("Fantasia"),
   PORNO("Porno"),
   FILOSOFIA("Filosofia"),
   GUERRA("Guerra"),
   HISTORIA("História"),
   LIT_ESTRANGEIRA("Literatura Estrangeira"),
   LINGUISTICA("Linguística"),
   LIT_INFANTO_JUVENIL("Literatura Infanto Juvenil"),
   MEDICINA("Medicina"),
   POLITICA("Política"),
   PSICOLOGIA("Psicologia"),
   ROMANCE("Romance"),
   QUADRINHOS("Quadrinhos"),
   RELIGIAO("Religião"),
   SAUDE("Saúde"),
   TERROR("Terror"),
   VESTIBULAR("Vestibular"),
   CRONICA("Crônica"),
   POESIA("Poesia");
   
   private String nome;

    EnumLivro(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
