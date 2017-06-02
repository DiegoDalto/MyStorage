/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.app;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author Diego
 */
@ApplicationPath("rest")
public class MyApplicationApp extends ResourceConfig{
    public MyApplicationApp(){
        packages("br.com.mystorage.controllers");  
    }
    
}
