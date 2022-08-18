package Aula3_Ex2;

public class Carro {

    String cor,marca,modelo;
    double velocidadeMax,velocidadeAtual;

    Motor motor = new Motor();

    void ligar(){
        System.out.println("Ligando!");
    }

    void acelerar(){
        System.out.println("Acelerando!!!");
        if(this.velocidadeAtual < this.velocidadeMax)
            this.velocidadeAtual += 10;
        else
            System.out.println("Limite de velocidade atingido!");
    }

    void mostraInfo(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Potencia: " + this.motor.potencia);
        System.out.println("Tipo de motor: " + this.motor.tipo);
    }

}
