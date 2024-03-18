package com.Marllon.dto;

public class OrdenServicoDTO {
    private String service;
    private String placa;

    private double preco;

    public OrdenServicoDTO(String service, String placa) {
        this.service = service;
        this.placa = placa;
    }

    public String getService() {
        return service;
    }

    public double getPreco() {
        return preco;
    }
    public OrdenServicoDTO(){

    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
