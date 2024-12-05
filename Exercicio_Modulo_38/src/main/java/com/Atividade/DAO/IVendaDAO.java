package com.Atividade.DAO;

import com.Atividade.DAO.Generic.IGenericDAO;
import com.Atividade.Domain.Venda;
import com.Atividade.Exceptions.DAOException;
import com.Atividade.Exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, Long> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public Venda consultarComCollection(Long id);
}