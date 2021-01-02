/*
 * 4. Modelagem do Padrão utilizando Programação Funcional
 * Observe que não temos mais as interfaces e classes específicas dos comportamentos. 
 * Cada comportamento nada mais é do que a implementação de um método (como o executarComportamentoA() 
 * do primeiro diagrama). O que precisamos de fato é permitir a troca da implementação de tal método em 
 * tempo de execução. Mas para isso, usando Programação Orientada a Objetos, tivemos que primeiro criar um
 * conjunto de classes e interfaces pra isso...
 * https://manoelcampos.com/padroes-projetos/comportamentais/strategy/#functional
 * Profº.: Manoel Campos.
 */
package com.mycompany.padraoprojetostrategprogfuncboletosbancarios;

import java.util.List;
import java.util.function.Function;

/**
 *
 * @author Lidiane
 */
public class ProcessarBoletos {

    private Function<String, List<Boleto>> leituraRetorno;

    public ProcessarBoletos(Function<String, List<Boleto>> leituraRetorno) {
        this.leituraRetorno = leituraRetorno;

    }

    public void processar(String nomeArquivo) {
        List<Boleto> boletos = leituraRetorno.apply(nomeArquivo);
        for (Boleto boleto : boletos) {
            System.out.println(boleto);
        }
    }

}
