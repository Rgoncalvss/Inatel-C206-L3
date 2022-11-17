package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Arquivo a = new Arquivo();
        Compra c = new Compra();
        int cont = 0;
        boolean flag = true;

        while (flag){
            System.out.println("----------------------------------------");
            System.out.println("1 - Cadastrar um novo animal");
            System.out.println("2 - Ler as infos");
            System.out.println("3 - Listar raca em ordem alfabetica");
            System.out.println("4 - Ordenar por peso");
            System.out.println("5 - Valor médio dos lucros");
            System.out.println("6 - Sair");
            System.out.println("----------------------------------------");
            System.out.println("Digite sua opcao: ");

            int op = sc.nextInt();

            switch (op){

                case 1:
                    sc.nextLine();
                    System.out.println("Digite o id do gado: ");
                    c.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Digite a raca do gado: ");
                    c.setRaca(sc.nextLine());
                    System.out.println("Digite o peso do gado: ");
                    c.setPeso(sc.nextInt());
                    System.out.println("Digite o valor de venda: ");
                    c.setPrecoVenda(sc.nextFloat());
                    a.adicionarGado(c);
                    break;

                case 2:

                    ArrayList<Compra> func = a.ler();
                    for (int i = 0; i<func.size(); i++) {
                        System.out.println("----------------------------------------");
                        System.out.println("Id: " + func.get(i).getId());
                        System.out.println("Raca: " + func.get(i).getRaca());
                        System.out.println("Peso: " + func.get(i).getPeso());
                        System.out.println("Preco: " + func.get(i).getPrecoVenda());
                    }
                    break;

                case 3:
                    ArrayList<Compra> ordem = a.ler();
                    Collections.sort(ordem);
                    for (int i = 0; i<ordem.size(); i++) {
                        System.out.println(ordem.get(i).getRaca());
                    }
                    break;
                case 4:
                    ArrayList<Compra> ordemPeso = a.ler();
                    Collections.sort(ordemPeso);
                    for (int i = 0; i<ordemPeso.size(); i++) {
                        System.out.println(ordemPeso.get(i).getPeso());
                    }
                case 5:
                    int media = 0;
                    ArrayList<Compra> mediaVenda = a.ler();
                    for (int i = 0; i<mediaVenda.size(); i++) {
                        media += mediaVenda.get(i).getPeso();
                        cont++;
                    }
                    System.out.println("Valor medio dos lucros: " + media/cont);
                    break;

                case 6:
                    flag = false;
                    System.out.println("Saiu!");
                default:
                    System.out.println("Opção invalida!");
                    break;

            }

        }
    }
}