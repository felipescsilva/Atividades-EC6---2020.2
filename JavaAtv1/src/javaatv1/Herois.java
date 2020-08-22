/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaatv1;

/**
 *
 * @author felipe.silva
 */
public class Herois extends Pessoas {
    
    public Herois(String nome, String profissao){
        super(nome, profissao);
    }
    
    @Override
    public void responder(Pessoas outro){
        System.out.println("Olá " +outro.getNome() + " eu sou um " +this.getProfissao());
        outro.pergunta(this);
    }
        
    @Override
    public void sonho(){
        System.out.println(this.getNome() + ": Levar a paz mundial a todos do planeta terra");
    }
}

