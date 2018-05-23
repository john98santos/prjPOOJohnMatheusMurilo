/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author john_
 */
public class APrazo {
    private double valor;
    private String dtVencimento;
    private double taxaJuros;
    private int qtdeMensalidade;
    private Matricula matriculas;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDtVencimento(String dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void setQtdeMensalidade(int qtdeMensalidade) {
        this.qtdeMensalidade = qtdeMensalidade;
    }

    public void setMatriculas(Matricula matriculas) {
        this.matriculas = matriculas;
    }

    
}
