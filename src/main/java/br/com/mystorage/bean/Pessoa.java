/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.bean;

import br.com.mystorage.enumeration.Permissao;
import java.util.List;

/**
 *
 * @author Diego
 */
public class Pessoa extends Bean<Long> {

    private String nome;
    private String cpf;
    private String login;
    private String senha;
    private String rg;
    private Permissao permissao;
    private Endereco endereco;

    private List<Telefone> listTelefone;
    private List<Aluguel> listAluguel;
    private List<Reserva> listReserva;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getListTelefone() {
        return listTelefone;
    }

    public void setListTelefone(List<Telefone> listTelefone) {
        this.listTelefone = listTelefone;
    }

    public List<Aluguel> getListAluguel() {
        return listAluguel;
    }

    public void setListAluguel(List<Aluguel> listAluguel) {
        this.listAluguel = listAluguel;
    }

    public List<Reserva> getListReserva() {
        return listReserva;
    }

    public void setListReserva(List<Reserva> listReserva) {
        this.listReserva = listReserva;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Permissao getPermissao() {
        return permissao;
    }

    public void setPermissao(Permissao permissao) {
        this.permissao = permissao;
    }

}
