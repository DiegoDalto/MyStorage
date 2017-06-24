/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.bean;

import br.com.mystorage.enumeration.TipoItem;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Diego
 */
public class Item extends Bean<Long> {

    private String sinopse;
    private Integer quantidade;
    private String nome;
    private TipoItem tipo;
    private Date dataLancamento;

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoItem getTipo() {
        return tipo;
    }

    public void setTipo(TipoItem tipo) {
        this.tipo = tipo;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "Item{" + ", sinopse=" + sinopse + ", quantidade=" + quantidade + ", nome=" + nome + ", tipo=" + tipo + ", dataLancamento=" + dataLancamento + '}';
    }
}
