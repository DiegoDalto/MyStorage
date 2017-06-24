/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.dao;

import br.com.mystorage.bean.Aluguel;
import br.com.mystorage.dao.utils.ReadWriteDAO;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Diego
 */
public class AluguelDAO extends ReadWriteDAO<Aluguel, Long>{

    public AluguelDAO() {
        super(Aluguel.class);
    }

    @Override
    protected void insert(Connection conn, Aluguel bean, Serializable... dependencies) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void update(Connection conn, Aluguel bean) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void delete(Connection conn, Long codigo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Aluguel get(Connection conn, Long codigo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<Aluguel> getAll(Connection conn) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
