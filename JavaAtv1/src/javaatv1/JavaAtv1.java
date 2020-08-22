/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaatv1;
import java.util.*;

/**
 *
 * @author felipe.silva
 */
public class JavaAtv1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoas felipe = new Pessoas("Felipe", "Desenvolvedor LUA");
        Pessoas rafael = new Pessoas("Rafael", "Estudante");
        
        Herois capitao = new Herois("Capitão América", "Herói");
        
        felipe.comprimentar(rafael);
        System.out.println();
        rafael.comprimentar(capitao);
        
        
    }
    
}
