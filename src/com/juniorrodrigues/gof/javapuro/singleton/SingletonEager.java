package com.juniorrodrigues.gof.javapuro.singleton;

/**
 * Sigleton Eager "apressado",
 *
 * @author valdionorjunior
 */
public class SingletonEager {

    private static SingletonEager instacice= new SingletonEager();

    // garante que niguem vai instaciar pro estar private
    // a classe garante que ela vai instaciar ela mesma;
    private SingletonEager() {
        super();
    }

    // diponibilizo uma instancia da classe
    // aqui ele ja cria a instacia e instacia a mesma no momento em que a variavel estatica e definida
    public static SingletonEager getInstance() {

        return instacice;
    }
}
