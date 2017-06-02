/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.bean;

import br.com.mystorage.enumeration.TipoItem;
import java.time.LocalDate;

/**
 *
 * @author Diego
 */
public class Item {
    private Long id;
    private String sinopse;
    private Integer quantidade;
    private String nome;
    private TipoItem tipo;
    private LocalDate dataLancamento;
    
    
}
