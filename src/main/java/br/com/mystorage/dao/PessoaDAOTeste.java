/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.dao;

import br.com.mystorage.bean.Pessoa;
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
public class PessoaDAOTeste extends ReadWriteDAO<Pessoa, Long> {

    public PessoaDAOTeste() {
        super(Pessoa.class);
    }

    @Override
    protected void insert(Connection conn, Pessoa bean, Serializable... dependencies) throws SQLException {
        String sql = "INSERT INTO pessoa (nome, login, senha) VALUES (?, ?, ?) RETURNING id";
        EnderecoDAO enderecoDAO = DAOFactory.getInstance().getEnderecoDAO();
        try (PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, bean.getNome());
            ps.setString(2, bean.getLogin());
            ps.setString(3, bean.getSenha());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.first()) {
                    bean.setID(rs.getLong("id"));
                    enderecoDAO.insert(conn, bean.getEndereco(), bean.getID());
                }
            }
            conn.commit();
        } catch (SQLException ex) {
            conn.rollback();
            throw ex;
        }
    }

    @Override
    protected void update(Connection conn, Pessoa bean) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void delete(Connection conn, Long codigo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Pessoa get(Connection conn, Long codigo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<Pessoa> getAll(Connection conn) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
