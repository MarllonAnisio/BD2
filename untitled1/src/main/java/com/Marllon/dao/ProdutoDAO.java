package com.Marllon.dao;

import com.Marllon.Model.Produto;
import com.Marllon.dto.ProdutoDTO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class ProdutoDAO implements ProdutosCrudInterface{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
    EntityManager em = emf.createEntityManager();

    public boolean createProduct(Produto prod){

        try{
            em.getTransaction().begin();
            em.persist(prod);
            em.getTransaction().commit();
            System.out.println(prod.toString());
            return true;
        }catch (PersistenceException p){
            return false;
        }finally {
            em.close();
            emf.close();
        }
    }

    public boolean updateProduct(Produto prod){
        return false;

    }
    public boolean deleteProduct(Integer a){
        try{
            Produto prod = em.find(Produto.class, a);
            if(prod == null)
                return false;

            em.getTransaction().begin();
            em.remove(prod);
            em.getTransaction().commit();
            System.out.println(prod.toString());
            return true;
        }catch(PersistenceException p){
            return false;
        }finally {
            em.close();
            emf.close();
        }

        }

    public ProdutoDTO readProduct(Integer a){
        try{
            Produto prod = em.find(Produto.class, a);
            if(prod == null)
                return null;
            System.out.println(prod.toString());
            ProdutoDTO produtoDTO = new ProdutoDTO(prod);
            return produtoDTO;
        }catch(PersistenceException p){
            return null;
        }finally {
            em.close();
            emf.close();
        }
    }

    public ProdutoDAO() {
    }
}
