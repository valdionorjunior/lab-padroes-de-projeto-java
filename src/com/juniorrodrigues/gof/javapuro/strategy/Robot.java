package com.juniorrodrigues.gof.javapuro.strategy;

public class Robot {

    private Behavior comportamento;

    public void setComportamento(Behavior comportamento) {
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
}
