/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mystorage.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class ConexaoPostgreeSQL {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/mystorage";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgres";

    /**
     * Cria um objeto Database.
     *
     * Este construtor é privado, pois esta classe segue o padrão de projeto
     * "Singleton".
     *
     * Na criação deste objeto, o driver do banco de dados é prontamente
     * carregado. Caso ocorra uma exceção neste momento, verifique se a
     * biblioteca do MySQL foi adicionada a este projeto.
     */
    private ConexaoPostgreeSQL() {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex.getMessage());
        }
    }

    /**
     * Retorna a única instância desta classe.
     *
     * @return the instance
     */
    public static ConexaoPostgreeSQL getInstance() {
        return DatabaseManagerHolder.INSTANCE;
    }

    /**
     * Estabelece uma conexão com o banco de dados.
     *
     * @return a conexão com o banco de dados.
     *
     * @throws SQLException
     */
    public Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        conn.setAutoCommit(false);
        return conn;
    }

    /**
     * Classe privada que armazena a única instância de DatabaseManager.
     */
    private static class DatabaseManagerHolder {

        private static final ConexaoPostgreeSQL INSTANCE = new ConexaoPostgreeSQL();
    }

}
