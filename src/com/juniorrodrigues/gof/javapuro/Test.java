package com.juniorrodrigues.gof.javapuro;

import com.juniorrodrigues.gof.javapuro.facade.Facade;
import com.juniorrodrigues.gof.javapuro.singleton.SingletonEager;
import com.juniorrodrigues.gof.javapuro.singleton.SingletonLazy;
import com.juniorrodrigues.gof.javapuro.singleton.SingletonLazyHolder;
import com.juniorrodrigues.gof.javapuro.strategy.*;

public class Test {

    public static void main(String[] args) {
        // Teste relacionados ao Design Pattern Sigleton:
        System.out.println("Teste relacionados ao Design Pattern Sigleton:");

        //retonara a mesma instacia
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        //retonara a mesma instacia
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        //retonara a mesma instacia
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // Teste relacionados ao Design Pattern Strategy:
        System.out.println("\nTeste relacionados ao Design Pattern Strategy:");

        Behavior normal = new NormalBehvior();
        Behavior defencivo = new DefensiveBehvior();
        Behavior agressivo = new AggressiveBehvior();

        Robot robot = new Robot();
        robot.setComportamento(normal);

        robot.mover();
        robot.mover();

        robot.setComportamento(defencivo);

        robot.mover();
        robot.mover();

        robot.setComportamento(agressivo);

        robot.mover();
        robot.mover();

        // Teste relacionados ao Design Pattern Facade:
        System.out.println("\nTeste relacionados ao Design Pattern Facade:");

        Facade facade = new Facade();
        facade.MigrarCliente("Valdionor", "39895-000");
    }
}
