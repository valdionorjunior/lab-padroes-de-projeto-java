package com.juniorrodrigues.gof.javapuro.facade;

import com.juniorrodrigues.gof.subsistema1.crm.CrmService;
import com.juniorrodrigues.gof.subsistema2.cep.CepApi;

/**
 * Facade.
 *
 * A ideia do Facade e que ela seja uma interface,
 * que dentro dela realize operacoes pra que agente possa consolidar ou expor
 * um interface mais simples pra uma operacao mais complexa
 * Abstrai a complexidade de integracao de outros sistemas ou apis para um consumo mais simples
 *
 * @author valdionorjunior
 */
public class Facade {

    // interface de uso mais simples
    public void MigrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

}
