package com.Marllon.view;

import com.Marllon.Model.OrdenServico;
import com.Marllon.Model.Pessoa;
import com.Marllon.controller.Aorden;
import com.Marllon.controller.ProdutosCRUD;
import com.Marllon.dto.OrdenServicoDTO;
import com.Marllon.dto.ProdutoDTO;
import org.hibernate.internal.build.AllowSysOut;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String vari = "inicio";
        while(!vari.equals("0")){
        System.out.println("O que deseja:  \nCadastrar produto[ 1 ]\n" +
                "Deletar Produto[ 2 ]\nler Produto[ 3 ]\natualizar produto[ 4 ]\n" +
                "gerar orden De serviço[ 5 ]\ndeletar Orden de servico[ 6 ]\nFecharPrograma[ 0 ]"
        );
        vari = leitor.nextLine();
        OrdenServicoDTO ordenServicoDTO = new OrdenServicoDTO();
        Aorden aorden = new Aorden();
            ProdutosCRUD prods = new ProdutosCRUD();
            ProdutoDTO prod;
            switch (vari) {

            case "1":
                prod = new ProdutoDTO();
                System.out.println("digite o nome do produto");
                prod.setNomeProduto(leitor.nextLine());
                System.out.println("digite a descrção do produto");
                prod.setDescricao(leitor.nextLine());
                System.out.println("digite a quantidade");
                prod.setQtd(Integer.parseInt(leitor.nextLine()));
                System.out.println("digite o preço do produto: ");
                prod.setPreco(Double.parseDouble(leitor.nextLine()));
                System.out.println("digite o tipo dele agora:\n" +
                        "SUSPENÇÃO[ 1 ]\nPNEU[ 2 ]" +
                        "\nARREFECIMENTO[ 3 ]" +
                        "\nCORREIAS[ 4 ]" +
                        "\nTENSORES[ 5 ]" +
                        "\nLUBRIFICANTES[ 6 ]");
                prods.setTipo(leitor.nextLine());
                prods.create(prod);
                break;
            case "2":
                System.out.println("digite o id");
                prods.delete(Integer.parseInt(leitor.nextLine()));
                break;
            case "3":
                System.out.println("digite o id");
                ProdutoDTO retorno = prods.read(Integer.parseInt(leitor.nextLine()));
                System.out.println(retorno.toString());
                break;
            case "4":
                break;
            case "5":
                String servico = "inicio5";
                String controle = "w";

                while (!servico.equals("3")){
                    System.out.println("digite a baixo o que deseja\n" +
                        "Um balanceamento [ 1 ]\n" +
                        "Um Alinhamento[ 2 ]\n" +
                        "Nao quero nada[ 3 ]");
                    servico = leitor.nextLine();
                    System.out.println("digite sua placa");
                    controle = leitor.nextLine();
                    if(servico.equals("1")){
                        ordenServicoDTO.setPlaca(controle);
                        ordenServicoDTO.setService("B");
                        aorden.gerarOrden(ordenServicoDTO);
                    } else if (servico.equals("2")) {
                        ordenServicoDTO.setPlaca(controle);
                        ordenServicoDTO.setService("A");
                        aorden.gerarOrden(ordenServicoDTO);
                    }else{
                        servico = "3";
                    }

                }
                break;
            case "6":
                System.out.println("diga o Id da Orden");
                Integer id = Integer.parseInt(leitor.nextLine());
                if(!aorden.removerOrden(id)){
                    System.out.println("Valor informado nao corresponde a uma ordem do banco");
                }
                break;
            case "0":
                break;

            }
        }
    }
}