/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.bean;

import br.com.mystorage.enumeration.Status;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Diego
 */
public class Reserva {
    private Long id;
    private LocalDate data;
    private Status status;
    private Boolean efetivada;
    private List<Item> listItem;
}
