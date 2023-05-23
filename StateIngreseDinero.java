package com.designPatterns.State;

public class StateIngreseDinero extends State{
    public StateIngreseDinero(Vending vending){
        super(vending);
    }
    @Override
    String ingresarDinero() {
        vending.setState(new StateSacarCocaCola(vending));
        return "Validando dinero...";
    }

    @Override
    String sacarCocaCola() {
        return "Ingrese su dinero ";
    }
}
