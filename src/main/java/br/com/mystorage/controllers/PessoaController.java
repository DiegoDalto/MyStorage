/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.controllers;

import br.com.mystorage.bean.Pessoa;
import br.com.mystorage.dao.PessoaDAO;
import java.sql.SQLException;
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
        try {
            PessoaDAO pessoaDAO = new PessoaDAO();
            return pessoaDAO.listarPessoas();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PessoaController.class.getName()).log(Level.SEVERE, null, ex);
            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
        }
    };
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}/")
    //localhost:8080/mystorage/rest/pessoas/1/
    public Pessoa getPessoa(@PathParam("id") long id) {
        try{
            PessoaDAO pessoaDAO = new PessoaDAO();
            return pessoaDAO.selecionarPessoa(id);
        } catch (SQLException | ClassNotFoundException ex){
            Logger.getLogger(PessoaController.class.getName()).log(Level.SEVERE, null, ex);
            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
    ;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/")
    public Response createPessoa(Pessoa pessoa) {
        try {
            PessoaDAO pessoaDAO = new PessoaDAO();
            pessoaDAO.inserirPessoa(pessoa);
            return Response.status(Response.Status.OK).build();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PessoaController.class.getName()).log(Level.SEVERE, null, ex);
            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
    ;
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/")
    public Response updatePessoa(Pessoa pessoa) {
        try{
            PessoaDAO pessoaDAO = new PessoaDAO();
            pessoaDAO.alterarPessoa(pessoa);
            return Response.status(Response.Status.OK).build();
        }catch(SQLException | ClassNotFoundException ex){
            Logger.getLogger(PessoaController.class.getName()).log(Level.SEVERE, null, ex);
            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
    ;

    @DELETE
    @Path("{id}/")
    public Response deletePessoa(@PathParam("id") long id) {
        try{
            PessoaDAO pessoaDAO = new PessoaDAO();
            pessoaDAO.excluirPessoa(id);
            return Response.status(Response.Status.OK).build();
        }catch(SQLException | ClassNotFoundException ex){
            Logger.getLogger(PessoaController.class.getName()).log(Level.SEVERE, null, ex);
            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
        }
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
