package Aula3_Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();

        Scanner p = new Scanner(System.in);

        System.out.println("Entre com o codigo do produto: ");
        produto.codigoProduto = p.nextLine();
        System.out.println("Entre com o nome do produto: ");
        produto.nome = p.nextLine();
        System.out.println("Entre com a categoria do produto: ");
        produto.categoria = p.nextLine();
        System.out.println("Entre com o codigo serie: ");
        produto.codigoSerie = p.nextInt();
        System.out.println("Entre com a quantidade: ");
        produto.quantidade = p.nextInt();

        produto.mostraInfo();

        p.close();
    }
}
