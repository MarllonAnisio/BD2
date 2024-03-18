package com.Marllon.controller;

import com.Marllon.Model.Produto;
import com.Marllon.dto.ProdutoDTO;

public class ProdutosCRUD {
    private Produto produto;
    private java.lang.String tipo;
    public boolean create(ProdutoDTO p){
        switch (tipo) {
            //SUSPENÇÃO,PNEU,ARREFECIMENTO,CORREIAS,TENSORES,LUBRIFICANTES;
            case "1":
                p.setCategoria("SUSPENÇÃO");
                break;
            case "2":
                p.setCategoria("PNEU");
                break;
            case "3":
                p.setCategoria("ARREFECIMENTO");
                break;
            case "4":
                p.setCategoria("CORREIAS");
                break;
            case "5":
                p.setCategoria("TENSORES");
                break;
            case "6":
                p.setCategoria("LUBRIFICANTES");
                break;
        }
        produto = new Produto(p);
        return produto.createProduct(produto);
    }
    public boolean delete(Integer a){
        produto = new Produto();
        return produto.deleteProduct(a);
    }
    public ProdutoDTO read(Integer a){
        produto = new Produto();
        return produto.readProduct(a);
    }

    public java.lang.String getTipo() {
        return tipo;
    }

    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }

}

