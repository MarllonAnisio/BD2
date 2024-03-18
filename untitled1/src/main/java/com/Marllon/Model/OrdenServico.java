package com.Marllon.Model;

import com.Marllon.dao.OrdenDAO;
import com.Marllon.dto.OrdenServicoDTO;

import javax.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
public class OrdenServico {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer Id;
    @Column(name = "Placa")
    private String placa;
   @Column(name = "Data")
    private Date data;
   // @Column(name = "Hora")
   // @Temporal(TemporalType.TIMESTAMP)
   // private Time hora;
    @Column(name = "Preço")
    private double preco;

    public OrdenServico(OrdenServicoDTO serv){
        this.placa = serv.getPlaca();
        this.data = new Date();
        this.preco = serv.getPreco();

    }

    public OrdenServico() {
    }

    public OrdenServico(Integer id, String placa, double preco) {
        Id = id;
        this.placa = placa;
        this.data = new Date();
        this.preco = preco;
    }


    public int hashCode() {
        return Objects.hash(Id, getPlaca(), getData());
    }

    public java.lang.String toString() {
        return "OrdenServico{" +
                "Id=" + Id +
                ", placa='" + placa + '\'' +
                ", data=" + data +
               // ", hora=" + hora +
                '}';
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }




    public boolean gerarOrdem(OrdenServicoDTO ordendto){
        OrdenDAO orden = new OrdenDAO();
        OrdenServico ordens = new OrdenServico(ordendto);
        return orden.createOrder(ordens);

    }
    public boolean cancelarOrden(Integer a){
       OrdenDAO ordenDAO = new OrdenDAO();
       return ordenDAO.removerOrden(a);


    }
    public OrdenServico(Integer id, String placa) {
        Id = id;
        this.placa = placa;
    }
}
