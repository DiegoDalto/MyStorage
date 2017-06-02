/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Diego
 * ESTA CLASSE SERVE SOMENTE PARA TESTE DO JERSEY, PARA VER SE O JERSEY ESTÁ FUNCIONANDO CORRETAMENTE.
 */
@Path("hello")
public class TesteController {
    //localhost:8080/mystorage/rest/hello/?usuario=diego
    @GET
    @Produces(MediaType.TEXT_PLAIN)
     public String getMensagem(@QueryParam("usuario") String usuario){
        return "O Jersey funciono" + usuario;
    }
    //localhost:8080/mystorage/rest/hello/usuarios/1 
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("usuarios/{id}")
    public String getUsuario(@PathParam("id") long id){
        return "Recuperando usuario com ID: "+id;
    }
}
