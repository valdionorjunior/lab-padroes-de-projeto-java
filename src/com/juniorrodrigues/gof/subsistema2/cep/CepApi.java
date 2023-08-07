package com.juniorrodrigues.gof.subsistema2.cep;

public class CepApi {

    private static CepApi instacice= new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {

        return instacice;
    }

    public String recuperarCidade(String cep){

        // mocado
        return "Felisburgo";
    }
    public String recuperarEstado(String cep){

        // mocado
        return "MG";
    }

}
