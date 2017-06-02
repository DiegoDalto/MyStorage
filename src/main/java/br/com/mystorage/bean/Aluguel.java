/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.bean;

import java.time.LocalDate;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Diego
 */
public class Aluguel {
    private Long id;
    private Double valor;
    private Double multa;
    private LocalDate dataEntrega;
    private LocalDate dataEntregaEfetivada;
    private LocalDate dataAluguel;
    private List<Item> listItems;

}
