/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_ciclos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio6_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero, suma=0;
        
        System.out.println("Ingrese un número: ");
        numero = entrada.nextInt();
        
       
        while(numero!=0){
            suma = suma + numero;
            System.out.println("Ingrese otro numero: ");
            numero = entrada.nextInt(); 
            
        }
        System.out.println(suma);
        
    }
    
}
