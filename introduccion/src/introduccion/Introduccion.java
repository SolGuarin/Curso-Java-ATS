/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Introduccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //CONSTANTES
        //final int numero = 10;
        //System.out.println(numero);
        
        //ENTRADA Y SALIDA DE DATOS
        
        //GUARDAR NUMEROS Y CADENAS 
        Scanner entrada = new Scanner(System.in);
        int numero;
        String palabra;
        char caracter;
        
        System.out.print("Digite un número: ");
        numero = entrada.nextInt();
        
        System.out.print("Digite su nombre: ");
        palabra = entrada.nextLine();
        
        System.out.print("Digite una letra: ");
        caracter = entrada.next().charAt(0);
        
        System.out.println("El número es:"+numero);
   
        System.out.println("Su nombre es:"+palabra);
        
        System.out.println("El caracter es:"+caracter);
    
        
    }
    
}
