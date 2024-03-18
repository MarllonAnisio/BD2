package com.Marllon.dao;

import com.Marllon.Model.Produto;
import com.Marllon.dto.ProdutoDTO;

public interface ProdutosCrudInterface {
    public boolean createProduct(Produto prod);
    public boolean updateProduct(Produto prod);
    public boolean deleteProduct(Integer a);
    public ProdutoDTO readProduct(Integer a);
}
