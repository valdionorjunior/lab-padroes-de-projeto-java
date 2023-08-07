package com.juniorrodrigues.gof.javapuro.singleton;

/**
 * Sigleton Lazy Holder
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 *
 * @author valdionorjunior
 */
public class SingletonLazyHolder {


    private static class InstanceHolder {
        // encapsula a instancia em uma classe statica intgerna;
        public static SingletonLazyHolder instacice = new SingletonLazyHolder();

    }

    // garante que niguem vai instaciar pro estar private

    private SingletonLazyHolder() {
        super();
    }

    // diponibilizo uma instancia da classe
    public static SingletonLazyHolder getInstance() {

        return InstanceHolder.instacice;
    }
}
