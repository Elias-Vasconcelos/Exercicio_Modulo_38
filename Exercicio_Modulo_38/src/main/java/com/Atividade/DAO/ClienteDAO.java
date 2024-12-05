package com.Atividade.DAO;

import com.Atividade.DAO.Generic.GenericDAO;
import com.Atividade.Domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

    public ClienteDAO() {
        super(Cliente.class);

 }
}
