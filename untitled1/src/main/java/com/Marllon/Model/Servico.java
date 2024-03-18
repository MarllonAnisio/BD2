package com.Marllon.Model;


public class Servico {

    private double maoDeObra;
    private final double alinhamento = 40;
    private final double balanceamento = 10;

    public double getMaoDeObra() {
        return maoDeObra;
    }

    public void setMaoDeObra(String p) {
        if(p.equals("A")){
            this.maoDeObra = alinhamento;
        }else if (p.equals("B")) {
            this.maoDeObra = balanceamento;

        }

    }
}
