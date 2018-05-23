/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author john_
 */
public class Matricula {
    private String data;
    private int qtdeFaltas;
    private double nota;
    private AVista vista;
    private APrazo prazo;

    public Matricula(String data) {
        this.data = data;
    }

    public void setQtdeFaltas(int qtdeFaltas) {
        this.qtdeFaltas = qtdeFaltas;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
     public void EmitirCarne() {
        
    }   
     
    public void addAVista(AVista v){
        vista = v;
        v.setMatriculas(this);
    }
    
    public void addAPrazo(APrazo p){
        prazo = p;
        p.setMatriculas(this);
    }    
}
