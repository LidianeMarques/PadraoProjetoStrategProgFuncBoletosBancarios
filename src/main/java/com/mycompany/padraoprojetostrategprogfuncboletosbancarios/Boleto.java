/*
 * Implementação do Retorno Boleto
 * A seção 4 do material disponível aqui apresenta o problema de leitura de 
 * arquivos de retorno de boletos bancários, que podemos utilizar o padrão Strategy mais programação
 * funcional para resolver. Lá é descrito o problema e fornecido um diagrama. Relacione este 
 * diagrama concreto com o diagrama teórico do padrão e assim implemente uma aplicação 
 * console em Java que aplica o padrão Strategy mais programação funcional e faça a leitura 
 * de arquivos para o Banco do Brasil e Bradesco.

 * Em anexo são fornecidos dois arquivos de retorno de exemplo para tais bancos, 
 * para utilizar na implementação. A implementação do Banco do Brasil já está pronta no GitHub,
 * mas se você apenas olhar tal implementação antes de fazer a sua., não aprenderá nada com isso.
 * Profº.: Manoel Campos.

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

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Lidiane
 */
public class Boleto {

    private int id;
    private double valor;
    private double multa;
    private double juros;
    private LocalDate dataVencimento;
    private LocalDateTime dataPagamento;//No Bradesco tem o hora.
    private String cpfCliente;//No Bradesco, tem o (.) e o (-)
    private String codBanco;
    private String agencia;//Para o banco do Bradesco.
    private String contaCliente;//Para o banco do Bradesco.
    private String contaBancaria;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the multa
     */
    public double getMulta() {
        return multa;
    }

    /**
     * @param multa the multa to set
     */
    public void setMulta(double multa) {
        this.multa = multa;
    }

    /**
     * @return the juros
     */
    public double getJuros() {
        return juros;
    }

    /**
     * @param juros the juros to set
     */
    public void setJuros(double juros) {
        this.juros = juros;
    }

    /**
     * @return the dataVencimento
     */
    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    /**
     * @param dataVencimento the dataVencimento to set
     */
    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    /**
     * @return the dataPagamento
     */
    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    /**
     * @param dataPagamento the dataPagamento to set
     */
    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    /**
     * @return the cpfCliente
     */
    public String getCpfCliente() {
        return cpfCliente;
    }

    /**
     * @param cpfCliente the cpfCliente to set
     */
    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    /**
     * @return the codBanco
     */
    public String getCodBanco() {
        return codBanco;
    }

    /**
     * @param codBanco the codBanco to set
     */
    public void setCodBanco(String codBanco) {
        this.codBanco = codBanco;
    }

    /**
     * @return the agencia
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the contaCliente
     */
    public String getContaCliente() {
        return contaCliente;
    }

    /**
     * @param contaCliente the contaCliente to set
     */
    public void setContaCliente(String contaCliente) {
        this.contaCliente = contaCliente;
    }

    /**
     * @return the contaBancaria
     */
    public String getContaBancaria() {
        return contaBancaria;
    }

    /**
     * @param contaBancaria the contaBancaria to set
     */
    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

}
