package br.com.mystorage.dao.utils;

import br.com.mystorage.dao.EnderecoDAO;
import br.com.mystorage.dao.PessoaDAO;

/*
 * Copyright (C) 2016 kleberkruger
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author kleberkruger
 */
public class DAOFactory {

    private final PessoaDAO pessoaDAO;
    private final EnderecoDAO enderecoDAO;
    
    

    private DAOFactory() {
        this.pessoaDAO = new PessoaDAO();
        this.enderecoDAO = new EnderecoDAO();
    }

    public EnderecoDAO getEnderecoDAO() {
        return enderecoDAO;
    }

  

    public static DAOFactory getInstance() {
        return DAOFactoryHolder.INSTANCE;
    }

    private static class DAOFactoryHolder {

        private static final DAOFactory INSTANCE = new DAOFactory();
    }

}
