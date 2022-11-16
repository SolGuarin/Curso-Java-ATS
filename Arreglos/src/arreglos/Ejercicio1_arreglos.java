//Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden introducido

package arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1_arreglos {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        
        int [] numeros = new int [5];
        
        System.out.println("Digite 5 números: ");
        for(int i=0; i<5; i++){
            System.out.print("Digite el número "+(i+1)+": ");
            numeros [i]= entrada.nextInt();
        }
        System.out.println("\nLos números ingresados son: ");
        for(int i:numeros){
            System.out.println(i);
        }
        
        
    }
    
}
