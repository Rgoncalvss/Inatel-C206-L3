package org.example;

public class PrejuizoException extends Exception{

    PrejuizoException(float valor){
        System.out.println("Venda abaixo do valor");
    }
}
