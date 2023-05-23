package com.designPatterns.State;

public class Vending {
    public State state;
    public Vending(){
        state = new StateIngreseDinero(this);
    }

    public void setState(State state) {
        System.out.println("Estado inicial " + this.state.getClass().getName());
        this.state = state;
        System.out.println("Estado final " + this.state.getClass().getName());

    }

    public State getState() {
        return state;
    }
}
