package com.Marllon.dao;

import com.Marllon.Model.OrdenServico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class OrdenDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
    EntityManager em= emf.createEntityManager();


    public boolean createOrder(OrdenServico orden){

        try{
            emf = Persistence.createEntityManagerFactory("exemplo-jpa");
            em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(orden);
            em.getTransaction().commit();
            System.out.println(orden.toString());
            return true;
        }catch (PersistenceException p){
            return false;
        }finally {
            em.close();
            emf.close();
        }



            }



    public boolean removerOrden(Integer a){
        try{

            OrdenServico ord = em.find(OrdenServico.class, a);
            if(ord == null){
                return false;
            }
            em.getTransaction().begin();
            em.remove(ord);

            em.getTransaction().commit();
            System.out.println(ord.toString());
            return true;
        }catch(PersistenceException p){
            return false;
        }finally {
            em.close();
            emf.close();
        }

    }
}
