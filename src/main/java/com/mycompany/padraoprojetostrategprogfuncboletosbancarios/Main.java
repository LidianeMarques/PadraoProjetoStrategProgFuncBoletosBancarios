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

/**
 *
 * @author Lidiane
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProcessarBoletos processador = new ProcessarBoletos(LeituraRetorno::lerBancoDoBrasil);
        //lerBancoDoBradesco
        String nomeArquivo = "banco-brasil-1.csv";
        // String nomeArquivo = "bradesco-1.csv";
        processador.processar(nomeArquivo);
    }

}
