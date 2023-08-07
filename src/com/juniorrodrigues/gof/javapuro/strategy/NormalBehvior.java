package com.juniorrodrigues.gof.javapuro.strategy;

public class NormalBehvior implements Behavior {

    @Override
    public void mover() {
        System.out.println("Movendo-se noralmente....");
    }
}
