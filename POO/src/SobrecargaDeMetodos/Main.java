/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SobrecargaDeMetodos;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String [] args){
        
        Persona persona1 = new Persona("Soleny", 23);
        persona1.correr();
        
        Persona persona2 = new Persona ("1041204992");
        persona2.correr(100);
        
    }
    
}
