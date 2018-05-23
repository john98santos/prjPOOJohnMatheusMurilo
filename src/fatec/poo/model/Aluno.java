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
public class Aluno extends Pessoa{
    private String escolaridade;
    
    public Aluno(String nome, String cpf){
        super (nome, cpf);
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
    
    
}
