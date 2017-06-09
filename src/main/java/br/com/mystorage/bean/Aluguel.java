/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.bean;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Diego
 */
public class Aluguel extends Bean<Long> {

    private Long id;
    private Double valor;
    private Double multa;
    private Date dataEntrega;
    private Date dataEntregaEfetivada;
    private Date dataAluguel;
    private List<Item> listItemsAlugados;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Date getDataEntregaEfetivada() {
        return dataEntregaEfetivada;
    }

    public void setDataEntregaEfetivada(Date dataEntregaEfetivada) {
        this.dataEntregaEfetivada = dataEntregaEfetivada;
    }

    public Date getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(Date dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public List<Item> getListItemsAlugados() {
        return listItemsAlugados;
    }

    public void setListItemsAlugados(List<Item> listItemsAlugados) {
        this.listItemsAlugados = listItemsAlugados;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluguel other = (Aluguel) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aluguel{" + "id=" + id + ", valor=" + valor + ", multa=" + multa + ", dataEntrega=" + dataEntrega + ", dataEntregaEfetivada=" + dataEntregaEfetivada + ", dataAluguel=" + dataAluguel + ", listItemsAlugados=" + listItemsAlugados + '}';
    }
}
