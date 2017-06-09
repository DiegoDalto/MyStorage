/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.dao;

import br.com.mystorage.bean.Endereco;
import br.com.mystorage.db.ConexaoJDBC;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Diego
 */
public class EnderecoDAO extends ReadWriteDAO<Endereco, Long> {

    public EnderecoDAO() {
        super(Endereco.class);
    }

   

    @Override
    protected void insert(Connection conn, Endereco bean, Serializable... dependencies) throws SQLException {
        String sql = "INSERT INTO endereco (logradouro, cidade, cep, numero, complemento, bairro) VALUES (?, ?, ?) RETURNING id";
        EnderecoDAO enderecoDAO = DAOFactory.getInstance().getEnderecoDAO();
        try (PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, bean.getLogradouro());
            ps.setString(2, bean.getCidade());
            ps.setString(3, bean.getCep());
            ps.setInt(4, bean.getNumero());
            ps.setString(5, bean.getComplemento());
            ps.setString(6, bean.getBairro());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.first()) {
                    bean.setID(rs.getLong("id"));
                    enderecoDAO.insert(conn, bean.getLogradouro(), bean.getID());
                }
            }
            conn.commit();
        } catch (SQLException ex) {
            conn.rollback();
            throw ex;
        }
    }

    @Override
    protected void delete(Connection conn, Long codigo) throws SQLException {
       String sql = "DELETE INTO endereco (logradouro, cidade, cep, numero, complemento, bairro) VALUES (?, ?, ?) RETURNING id";
        EnderecoDAO enderecoDAO = DAOFactory.getInstance().getEnderecoDAO();
        try (PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
//            ps.setString(1, bean.getLogradouro());
//            ps.setString(2, bean.getCidade());
//            ps.setString(3, bean.getCep());
//            ps.setInt(4, bean.getNumero());
//            ps.setString(5, bean.getComplemento());
//            ps.setString(6, bean.getBairro());
//            ps.executeUpdate();
//            try (ResultSet rs = ps.getGeneratedKeys()) {
//                if (rs.first()) {
//                    bean.setID(rs.getLong("id"));
//                    enderecoDAO.insert(conn, bean.getLogradouro(), bean.getID());
//                }
//            }
            conn.commit();
        } catch (SQLException ex) {
            conn.rollback();
            throw ex;
        }
    }

    @Override
    protected Endereco get(Connection conn, Long codigo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<Endereco> getAll(Connection conn) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void update(Connection conn, Endereco bean) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void insert(Connection conn, String logradouro, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
