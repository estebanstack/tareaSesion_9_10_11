package com.designPatterns.State;

abstract public class State {
    public Vending vending;

    public State(Vending vending){
        this.vending = vending;
    }

    abstract String ingresarDinero();
    abstract String sacarCocaCola();
}
