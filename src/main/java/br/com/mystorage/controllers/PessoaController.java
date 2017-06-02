/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.controllers;

import br.com.mystorage.bean.Pessoa;
import br.com.mystorage.dao.PessoaDAO;
import br.com.mystorage.enumeration.Permissao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Diego
 */
@Path("pessoas")
public class PessoaController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/")
    //localhost8080/mystorage/rest/pessoas/
    public List<Pessoa> listAllPessoas() {
//        try{
//        PessoaDAO pessoaDAO = new PessoaDAO();
//        return pessoaDAO.listarPessoas();
//        } catch(SQLException | ClassNotFoundException ex){
//            Logger.getLogger(PessoaController.class.getName()).log(Level.SEVERE, null, ex);
//            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
//        }
        Pessoa p1 = new Pessoa();
        p1.setId(0);
        p1.setCpf("000.000.000");
        p1.setLogin("admin");
        p1.setSenha("123");
        p1.setNome("Admin");
        p1.setRg("12912212");
        p1.setPermissao(Permissao.ADMIN);

        Pessoa p2 = new Pessoa();
        p2.setId(1);
        p2.setCpf("111.111.111");
        p2.setLogin("cliente");
        p2.setSenha("123");
        p2.setNome("Cliente");
        p2.setRg("12912212");
        p2.setPermissao(Permissao.CLIENTE);

        Pessoa p3 = new Pessoa();
        p3.setId(2);
        p3.setCpf("222.222.222");
        p3.setLogin("funcionario");
        p3.setSenha("123");
        p3.setNome("Funcionario");
        p3.setRg("12912212");
        p3.setPermissao(Permissao.FUNCIONARIO);

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        return pessoas;
    }

    ;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}/")
    //localhost:8080/mystorage/rest/pessoas/1/
    public Pessoa getPessoa(@PathParam("id") long id) {
//        try{
//            PessoaDAO pessoaDAO = new PessoaDAO();
//            return pessoaDAO.selecionarPessoa(id);
//        } catch (SQLException | ClassNotFoundException ex){
//            Logger.getLogger(PessoaController.class.getName()).log(Level.SEVERE, null, ex);
//            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
//        }

        Pessoa p1 = new Pessoa();
        p1.setId(id);
        p1.setCpf("000.000.000");
        p1.setLogin("admin");
        p1.setSenha("123");
        p1.setNome("Admin" + id);
        p1.setRg("12912212");
        p1.setPermissao(Permissao.ADMIN);

        return p1;
    }

    ;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/")
    public Response createPessoa(Pessoa pessoa) {
//        try {
//            PessoaDAO pessoaDAO = new PessoaDAO();
//            pessoaDAO.inserirPessoa(pessoa);
//            return Response.status(Response.Status.OK).build();
//        } catch (SQLException | ClassNotFoundException ex) {
//            Logger.getLogger(PessoaController.class.getName()).log(Level.SEVERE, null, ex);
//            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
//        }
        System.out.println(pessoa.toString());
        return Response.status(Response.Status.OK).build();
    }

    ;
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/")
    public Response updatePessoa(Pessoa pessoa) {
//        try{
//            PessoaDAO pessoaDAO = new PessoaDAO();
//            pessoaDAO.alterarPessoa(pessoa);
//            return Response.status(Response.Status.OK).build();
//        }catch(SQLException | ClassNotFoundException ex){
//            Logger.getLogger(PessoaController.class.getName()).log(Level.SEVERE, null, ex);
//            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
//        }

        System.out.println(pessoa.toString());
        return Response.status(Response.Status.OK).build();
    }

    ;

    @DELETE
    @Path("{id}/")
    public Response deletePessoa(@PathParam("id") long id) {
//        try{
//            PessoaDAO pessoaDAO = new PessoaDAO();
//            pessoaDAO.excluirPessoa(id);
//            return Response.status(Response.Status.OK).build();
//        }catch(SQLException | ClassNotFoundException ex){
//            Logger.getLogger(PessoaController.class.getName()).log(Level.SEVERE, null, ex);
//            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
//        }

        System.out.println("Deletando ID: " + id);
        return Response.status(Response.Status.OK).build();
    }

    ;
    //EPI 11, 10:48
    @PUT
    @Path("{id}/")
    public Response concluir(@PathParam("id") long id) {
        try {
            PessoaDAO pessoaDAO = new PessoaDAO();

            Pessoa p = pessoaDAO.selecionarPessoa(id);
            p.setNome("TROCANDO INFORMAÇÃO");
            
            pessoaDAO.alterarPessoa(p);
            return Response.status(Response.Status.OK).build();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PessoaController.class.getName()).log(Level.SEVERE, null, ex);
            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
}
