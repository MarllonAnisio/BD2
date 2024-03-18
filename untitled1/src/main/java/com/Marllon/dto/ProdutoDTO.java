package com.Marllon.dto;

import com.Marllon.Model.Produto;

import java.util.ArrayList;

public class ProdutoDTO {
    private ArrayList<java.lang.String> nomes;
    private java.lang.String nomeProduto;
    private java.lang.String descricao;
    private String tipo;
    private int Qtd;
    private double preco;



    public ProdutoDTO() {
    }

    public ArrayList<java.lang.String> getNomes() {
        return nomes;
    }

    public ProdutoDTO(Produto p){
        this.nomeProduto = p.getNomeProduto();
        this.descricao = p.getDescricao();
        this.Qtd = p.getQtd();
        this.tipo = p.getCategoria();
}

    public void setNomes(ArrayList<String> nomes) {
        this.nomes = nomes;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return tipo;
    }

    public void setCategoria(String string) {
        this.tipo = string;
    }

    public int getQtd() {
        return Qtd;
    }

    public void setQtd(int qtd) {
        Qtd = qtd;
    }
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
