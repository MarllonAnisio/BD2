package com.Marllon.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Pessoa implements Serializable {


@Column(name = "NomeCompleto")

private String nome;
    private String email;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    public Pessoa(){

    }

    public Pessoa(Integer id, String nome, String email){
        this.email = email;
        this.nome = nome;
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public java.lang.String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
