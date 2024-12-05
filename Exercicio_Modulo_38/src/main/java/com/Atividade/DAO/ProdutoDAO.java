package com.Atividade.DAO;

import com.Atividade.DAO.Generic.GenericDAO;
import com.Atividade.Domain.Produto;

public class ProdutoDAO extends GenericDAO<Produto, Long> implements IProdutoDAO {

    public ProdutoDAO() {
        super(Produto.class);
    }

}
