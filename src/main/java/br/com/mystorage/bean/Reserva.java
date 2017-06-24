/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.bean;

import br.com.mystorage.enumeration.Status;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Diego
 */
public class Reserva extends Bean<Long> {

    private Date data;
    private Status status;
    private Boolean efetivada;
    private List<Item> listItem;


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Boolean getEfetivada() {
        return efetivada;
    }

    public void setEfetivada(Boolean efetivada) {
        this.efetivada = efetivada;
    }

    public List<Item> getListItem() {
        return listItem;
    }

    public void setListItem(List<Item> listItem) {
        this.listItem = listItem;
    }

    @Override
    public String toString() {
        return "Reserva{" +", data=" + data + ", status=" + status + ", efetivada=" + efetivada + ", listItem=" + listItem + '}';
    }
}
