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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lidiane
 */
public class LeituraRetorno {

    public static List<Boleto> lerBancoDoBrasil(String nomeArquivo) {

        List<Boleto> listaBoletos = new ArrayList<Boleto>();
        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ";";
        try {

            br = new BufferedReader(new FileReader(nomeArquivo));
            while ((linha = br.readLine()) != null) {
                Boleto boleto = new Boleto();
                String[] dadosBoleto = linha.split(csvDivisor);
                if (dadosBoleto != null && dadosBoleto.length > 0) {
                    try {
                        boleto.setId(Integer.parseInt(dadosBoleto[0]));
                        boleto.setCodBanco(dadosBoleto[1]);
                        boleto.setDataVencimento(LocalDate.parse(dadosBoleto[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                        boleto.setDataPagamento(LocalDate.parse(dadosBoleto[3], DateTimeFormatter.ofPattern("dd/MM/yyyy")).atTime(0, 0, 0));
                        boleto.setCpfCliente(dadosBoleto[4]);
                        boleto.setValor(Double.parseDouble(dadosBoleto[5]));
                        boleto.setMulta(Double.parseDouble(dadosBoleto[6]));
                        boleto.setJuros(Double.parseDouble(dadosBoleto[7]));
                        listaBoletos.add(boleto);
                    } catch (Exception ex) {
                        System.out.println("ERRO AQUI DENTRO IF DE BOLETOS" + ex);
                    }
                    System.out.println("BANCO DO BRASIL" + "\n"
                            + "Id do boleto: " + boleto.getId() + "\n"
                            + "Cód banco onde o boleto foi pago: " + boleto.getCodBanco() + "\n"
                            + "Data vencimento: " + boleto.getDataVencimento() + "\n"
                            + "Data/hora pagamento: " + boleto.getDataPagamento() + "\n"
                            + "CPF do cliente (sem . e -); " + boleto.getCpfCliente() + "\n"
                            + "Valor do boleto: " + boleto.getValor() + "\n"
                            + "Multa por atraso: " + boleto.getMulta() + "\n"
                            + "Juros no formato: " + boleto.getJuros() + "\n");
                }

            }

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioex) {
            ioex.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ioex2) {
                    ioex2.printStackTrace();
                }
            }
        }
        return listaBoletos;
    }

    public static List<Boleto> lerBancoDoBradesco(String nomeArquivo) {

        List<Boleto> listaBoletos = new ArrayList<Boleto>();
        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ";";
        try {

            br = new BufferedReader(new FileReader(nomeArquivo));
            while ((linha = br.readLine()) != null) {
                Boleto boleto = new Boleto();
                String[] dadosBoleto = linha.split(csvDivisor);

                if (dadosBoleto != null && dadosBoleto.length > 0) {

                    try {
                        boleto.setId(Integer.parseInt(dadosBoleto[0]));
                        boleto.setCodBanco(dadosBoleto[1]);
                        boleto.setAgencia(dadosBoleto[2]);
                        boleto.setContaCliente(dadosBoleto[3]);
                        boleto.setDataVencimento(LocalDate.parse(dadosBoleto[4], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                        boleto.setDataPagamento(LocalDateTime.parse(dadosBoleto[5], DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
                        boleto.setCpfCliente(dadosBoleto[6].substring(0, 3) + "."
                                + dadosBoleto[6].substring(3, 6) + "."
                                + dadosBoleto[6].substring(6, 9) + "-"
                                + dadosBoleto[6].substring(9, 11));
                        boleto.setValor(Double.parseDouble(dadosBoleto[7]));
                        boleto.setMulta(Double.parseDouble(dadosBoleto[8]));
                        boleto.setJuros(Double.parseDouble(dadosBoleto[9]));
                        listaBoletos.add(boleto);

                    } catch (Exception ex) {
                        System.out.println("ERRO AQUI DENTRO DE IF DE BOLETOS:  " + ex);
                    }
                }

                System.out.println(""
                        + "BANCO BRADESCO" + "\n"
                        + "Id do boleto: " + boleto.getId() + "\n"
                        + "Cód banco onde o boleto foi pago: " + boleto.getCodBanco() + "\n"
                        + "Agência onde o boleto foi pago: " + boleto.getAgencia() + "\n"
                        + "Conta do cliente: " + boleto.getContaCliente() + "\n"
                        + "Data vencimento: " + boleto.getDataVencimento() + "\n"
                        + "Data/hora pagamento: " + boleto.getDataPagamento() + "\n"
                        + "CPF do cliente (com . e -); " + boleto.getCpfCliente() + "\n"
                        + "Valor do boleto: " + boleto.getValor() + "\n"
                        + "Multa por atraso: " + boleto.getMulta() + "\n"
                        + "Juros no formato: " + boleto.getJuros() + "\n");

            }

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioex) {
            ioex.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ioex2) {
                    ioex2.printStackTrace();
                }
            }
        }
        return listaBoletos;
    }

}
