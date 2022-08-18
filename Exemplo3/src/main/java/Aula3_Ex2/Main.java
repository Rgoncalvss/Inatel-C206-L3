package Aula3_Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();

        Scanner c = new Scanner(System.in);

        System.out.println("Informando sobre seu carro: ");
        System.out.println("Entre com a cor: ");
        carro.cor = c.nextLine();
        System.out.println("Entre com a marca: ");
        carro.marca = c.nextLine();
        System.out.println("Entre com o modelo: ");
        carro.modelo = c.nextLine();
        System.out.println("Entre com a velocidade maxima: ");
        carro.velocidadeMax = c.nextDouble();
        System.out.println("Entre com a velocidade atual: ");
        carro.velocidadeAtual = c.nextDouble();
        System.out.println("Entre com a potencia: ");
        carro.motor.potencia = c.nextInt();
        c.nextLine();
        System.out.println("Entre com o tipo do motor: ");
        carro.motor.tipo = c.nextLine();
        System.out.println("-----------------------");

        System.out.println("Informacoes do carro: ");
        carro.mostraInfo();

        System.out.println("-----------------------");
        carro.ligar();
        carro.acelerar();
        System.out.println("Velocidade atual: " + carro.velocidadeAtual);
        System.out.println("Velocidade Maxima: " + carro.velocidadeMax);

        c.close();

    }
}
