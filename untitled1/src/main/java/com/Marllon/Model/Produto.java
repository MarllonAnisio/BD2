package com.Marllon.Model;
import com.Marllon.dao.ProdutoDAO;
import com.Marllon.dao.ProdutosCrudInterface;
import com.Marllon.dto.ProdutoDTO;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "Produtos")
public class Produto implements ProdutosCrudInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "nome")
    @NotNull
    private java.lang.String nomeProduto;
    @Column(name = "Descrição")
    private java.lang.String descricao;

    @Column(name = "Categoria")
    private String categoria;
    @Column(name = "Quantidade")
    private int Qtd;
    @Column(name = "Preço")
    private double preco;


    public Produto() {

    }
    public Produto(ProdutoDTO prod) {
        this.nomeProduto = prod.getNomeProduto();
        this.id = null;
        this.categoria = prod.getCategoria();
        this.Qtd = prod.getQtd();
        this.descricao = prod.getDescricao();
        this.preco = prod.getPreco();

    }

    public Produto(Integer id, String nomeProduto, String descricao, String categoria, int qtd) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.categoria = categoria;
        Qtd = qtd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeDaPeca) {
        this.nomeProduto = nomeDaPeca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String string) {
        this.categoria = string;
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
        if(preco >0 )
            this.preco = preco;

    }

    @Override
    public java.lang.String toString() {
        return "Produto{" +
                "id=" + id +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", descricao='" + descricao + '\'' +
                ", categoria=" + categoria +
                ", Qtd=" + Qtd +
                ", preco=" + preco +
                '}';
    }

    @Override


    public boolean createProduct(Produto prod) {
        ProdutoDAO banco = new ProdutoDAO();
        return banco.createProduct(prod);
    }


    public boolean updateProduct(Produto prod) {
        return false;
    }


    public boolean deleteProduct(Integer a) {
        ProdutoDAO banco = new ProdutoDAO();
        return banco.deleteProduct(a);
    }


    public ProdutoDTO readProduct(Integer a) {
        ProdutoDAO banco = new ProdutoDAO();
        return banco.readProduct(a);
    }
}
