package com.juniorrodrigues.gof.javapuro.singleton;

/**
 * Sigleton Lazy "Preguicoso",
 *
 * @author valdionorjunior
 */
public class SingletonLazy {

    private static SingletonLazy instacice;

    // garante que niguem vai instaciar pro estar private
    // a classe garante que ela vai instaciar ela mesma;
    private SingletonLazy() {
        super();
    }

    // diponibilizo uma instancia da classe
    // a instacia sera realmente instaciada na chamada do metodo publico depois que a variavel staica e definida
    public static SingletonLazy getInstance() {
        if(instacice ==null){
            instacice = new SingletonLazy();
        }
        return instacice;
    }
}
