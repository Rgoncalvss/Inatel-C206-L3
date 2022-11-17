package org.example;

import java.util.Collections;

public class Compra implements Comparable<Compra>{

    private int id;
    private String raca;
    private int peso;
    private float precoVenda;

    @Override
    public int compareTo(Compra p) {
        return this.raca.compareTo(p.getRaca());
    }

    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }
}
