package com.juniorrodrigues.gof.javapuro.strategy;

public class DefensiveBehvior implements Behavior {

    @Override
    public void mover() {
        System.out.println("Movendo-se defencivamente....");
    }
}
