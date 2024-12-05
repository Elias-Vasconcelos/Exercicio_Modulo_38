package com.Atividade.Services;

import com.Atividade.DAO.Generic.IGenericDAO;
import com.Atividade.DAO.persistence;
import com.Atividade.Exceptions.DAOException;
import com.Atividade.Exceptions.MaisDeUmRegistroException;
import com.Atividade.Exceptions.TableException;
import com.Atividade.Exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public class GenericServices <T extends persistence, E extends Serializable>
        implements IGenericServices<T, E> {

    protected IGenericDAO<T, E> dao;

    public GenericServices(IGenericDAO<T, E> dao) {
        this.dao = dao;
    }


    @Override
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(T entity) throws DAOException {
        this.dao.excluir(entity);
    }

    @Override
    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
        return this.dao.consultar(valor);
    }

    @Override
    public Collection<T> buscarTodos() throws DAOException {
        return this.dao.buscarTodos();
    }


}