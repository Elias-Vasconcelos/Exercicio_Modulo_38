package com.Atividade.DAO.Generic;

import com.Atividade.DAO.persistence;
import com.Atividade.Exceptions.DAOException;
import com.Atividade.Exceptions.MaisDeUmRegistroException;
import com.Atividade.Exceptions.TableException;
import com.Atividade.Exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericDAO <T extends persistence, E extends Serializable> {


    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;
}