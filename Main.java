package com.designPatterns.State;

public class Main {
    public static void main(String[] args) {

        Vending vending = new Vending();

        System.out.println(vending.state.ingresarDinero());
        System.out.println(vending.state.sacarCocaCola());
        System.out.println(vending.state.sacarCocaCola());

    }
}

//apliqué el metodo state para este ejercicio simulando una maquina tipo vending de cocacola
//para así mostrar como funciona esta
