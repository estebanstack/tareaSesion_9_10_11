package com.designPatterns.State;

public class Main {
    public static void main(String[] args) {

        Vending vending = new Vending();

        System.out.println(vending.state.ingresarDinero());
        System.out.println(vending.state.sacarCocaCola());
        System.out.println(vending.state.sacarCocaCola());

    }
}
