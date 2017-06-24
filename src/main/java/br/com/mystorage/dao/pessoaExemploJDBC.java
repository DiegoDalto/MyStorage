/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.dao;

import br.com.mystorage.bean.Pessoa;
import br.com.mystorage.db.ConexaoJDBC;
import br.com.mystorage.db.ConexaoPostgresJDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class pessoaExemploJDBC {

    private final ConexaoJDBC conexao;

    public pessoaExemploJDBC() throws SQLException, ClassNotFoundException {
        this.conexao = new ConexaoPostgresJDBC();
    }

    public Long inserirPessoa(Pessoa pessoa) throws SQLException, ClassNotFoundException {
        Long id = null;
        String sqlQuery = "INSERT INTO pessoa (nome, login, senha) VALUES (?, ?, ?) RETURNING id";

        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sqlQuery);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getLogin());
            stmt.setString(3, pessoa.getSenha());

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    id = rs.getLong("id");
                }
            }
            this.conexao.commit();
        } catch (SQLException ex) {
            this.conexao.rollback();
            throw ex;
        }
        return id;
    }

    public int alterarPessoa(Pessoa pessoa) throws SQLException, ClassNotFoundException {
        String sqlQuery = "UPDATE pessoa SET nome = ?, login = ?, senha = ? WHERE id = ?";
        int linhasAfetadas = 0;

        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sqlQuery);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getLogin());
            stmt.setString(3, pessoa.getSenha());
            // stmt.setString(4, pessoa.getPermissao().toString());
            stmt.setLong(4, pessoa.getID());

            linhasAfetadas = stmt.executeUpdate();
            this.conexao.commit();

        } catch (SQLException ex) {
            this.conexao.rollback();
            throw ex;
        }
        return linhasAfetadas;
    }

    public int excluirPessoa(long id) throws SQLException, ClassNotFoundException {
        int linhasAfetadas = 0;
        String sqlQuery = "DELETE FROM pessoa WHERE id = ?";

        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sqlQuery);
            stmt.setLong(1, id);
            linhasAfetadas = stmt.executeUpdate();
            this.conexao.commit();
        } catch (SQLException ex) {
            this.conexao.rollback();
            throw ex;
        }
        return linhasAfetadas;
    }

    public Pessoa selecionarPessoa(long id) throws SQLException, ClassNotFoundException {
        String sqlQuery = "SELECT * FROM pessoa WHERE id = ?";

        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sqlQuery);
            stmt.setLong(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return parser(rs);
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return null;
    }

    public List<Pessoa> listarPessoas() throws SQLException, ClassNotFoundException {
        String sqlQuery = "SELECT * FROM pessoa ORDER BY id";

        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sqlQuery);
            ResultSet rs = stmt.executeQuery();

            List<Pessoa> pessoas = new ArrayList<>();

            while (rs.next()) {
                pessoas.add(parser(rs));
            }
            return pessoas;
        } catch (SQLException ex) {
            throw ex;
        }
    }

    private Pessoa parser(ResultSet resultset) throws SQLException {
        Pessoa p = new Pessoa();

        p.setID(resultset.getLong("id"));
        p.setNome(resultset.getString("nome"));
        p.setLogin(resultset.getString("login"));
        p.setSenha(resultset.getString("senha"));
        //  p.setPermissao(Permissao.valueOf(resultset.getString("permissao")));

        return p;
    }

}
