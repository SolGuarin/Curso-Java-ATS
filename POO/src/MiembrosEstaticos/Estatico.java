/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiembrosEstaticos;

/**
 *
 * @author Usuario
 */
public class Estatico {
    private static String frase = "Primera frase";
    
    public static int sumar(int n1, int n2){
        int suma = n1+n2;
        return suma;          
    }
    public static void main (String [] args){
        //Estatico objeto1 = new Estatico();
        //Estatico objeto2 = new Estatico();
        
        //objeto2.frase = "Segunda frase";
        //System.out.println(objeto1.frase);
        //System.out.println(objeto2.frase);
        
        //Se imprime la frase sin instanciar un objeto
        System.out.println("La suma es: "+Estatico.sumar(2, 3));
    }
    
}
