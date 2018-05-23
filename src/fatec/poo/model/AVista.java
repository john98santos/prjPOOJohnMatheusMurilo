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
public class AVista {
    private double valor;
    private int agencia;
    private int nCheque;
    private String preData;
    private Matricula matriculas;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setnCheque(int nCheque) {
        this.nCheque = nCheque;
    }

    public void setPreData(String preData) {
        this.preData = preData;
    }
    
    public void setMatriculas(Matricula matriculas) {
        this.matriculas = matriculas;
    }
        
}
