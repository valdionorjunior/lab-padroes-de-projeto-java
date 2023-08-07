package com.juniorrodrigues.gof.javapuro.strategy;

public class AggressiveBehvior implements Behavior {

    @Override
    public void mover() {
        System.out.println("Movendo-se Agressivo....");
    }
}
