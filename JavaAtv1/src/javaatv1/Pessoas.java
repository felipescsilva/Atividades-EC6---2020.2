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
public class Pessoas {
    
    private String nome;
    private String profissao;
    
    public Pessoas(String nome, String profissao){
        this.nome = nome;
        this.profissao = profissao;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    public void comprimentar(Pessoas outro){
        System.out.println(this.nome + ": Olá " +outro.getNome()+ " !");
        System.out.println(this.nome + ": Qual a sua profissão?");
        outro.responder(this);
    }
    
    public void responder(Pessoas outro){
        System.out.println(this.nome + ": Olá " +outro.getNome() + " eu sou " +this.getProfissao());
        outro.pergunta(this);
    }
    
    public void pergunta(Pessoas outro){
        System.out.println(this.nome + ": " +outro.getNome() + " Quais são seus sonhos?");
        outro.sonho();
    }
    
    public void sonho(){
        System.out.println(this.nome + ": Tenho o sonho de conquistar a liberdade financeira! ");
    }
    
}
