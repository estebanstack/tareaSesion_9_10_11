package com.designPatterns.State;

public class StateSacarCocaCola extends State{
    public StateSacarCocaCola(Vending vending){
        super(vending);
    }
    @Override
    String ingresarDinero() {
        return "Ya has ingresado el dinero, por favor retira tu CocaCola";
    }

    @Override
    String sacarCocaCola() {
        vending.setState(new StateIngreseDinero(vending));
        return "Disfruta tu CocaCola :)";
    }
}
