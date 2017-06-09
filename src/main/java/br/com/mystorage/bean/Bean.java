/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.bean;



import java.io.Serializable;

/**
 * Classe base para qualquer bean do banco de dados.
 *
 * @author Kleber Kruger
 * @param <T> tipo da chave primitiva
 */
public class Bean<T extends Serializable> implements Serializable {

    private static final long serialVersionUID = 1L;

    private T codigo;

    /**
     * Cria um novo objeto Bean. O construtor desta classe é protegido porque um objeto Bean só
     * existirá por meio de classes derivadas. Estes "beans" têm a função de representar as
     * entidades do banco de dados.
     */
    protected Bean() {
        codigo = null;
    }

    /**
     * @return the codigo
     */
    public T getID() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setID(T codigo) {
        this.codigo = codigo;
    }

}

