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
public class Instrutor extends Pessoa{
    private String Formacao;
    private String AreaAtuacao;
    private ArrayList<Turma> turmas = new ArrayList<Turma>();  

    public Instrutor(String nome, String cpf){
        super (nome, cpf);
    }
    
    public void setFormacao(String Formacao) {
        this.Formacao = Formacao;
    }

    public void setAreaAtuacao(String AreaAtuacao) {
        this.AreaAtuacao = AreaAtuacao;
    }

    public void addTurma(Turma t){
        turmas.add(t);
        t.setInstrutor(this);
    }
    
}