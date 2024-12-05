package com.Atividade.DAO;

import com.Atividade.DAO.Generic.GenericDAO;
import com.Atividade.Domain.Venda;
import com.Atividade.Exceptions.DAOException;
import com.Atividade.Exceptions.TipoChaveNaoEncontradaException;

public class VendaExclusaoDAO extends GenericDAO<Venda, Long> implements IVendaDAO {

    public VendaExclusaoDAO() {
        super(Venda.class);
    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public Venda consultarComCollection(Long id) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

}