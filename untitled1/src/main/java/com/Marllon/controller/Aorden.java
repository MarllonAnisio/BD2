package com.Marllon.controller;

import com.Marllon.Model.OrdenServico;
import com.Marllon.Model.Servico;
import com.Marllon.dto.OrdenServicoDTO;

public class Aorden {
    OrdenServico servico;
    public boolean gerarOrden(OrdenServicoDTO serv){
        Servico p = new Servico();

        p.setMaoDeObra(serv.getService());
        serv.setPreco(p.getMaoDeObra());
        servico = new OrdenServico();
        return servico.gerarOrdem(serv);


    }
    public boolean removerOrden(Integer a){
        servico = new OrdenServico();
        return servico.cancelarOrden(a);
    }
}
