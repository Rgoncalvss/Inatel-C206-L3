package Aula3_Ex1;

public class Produto {

    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    void mostraInfo(){
        System.out.println(this.codigoSerie);
        System.out.println(this.codigoProduto);
        System.out.println(this.nome);
        System.out.println(this.categoria);
        System.out.println(this.quantidade);
    }
}
