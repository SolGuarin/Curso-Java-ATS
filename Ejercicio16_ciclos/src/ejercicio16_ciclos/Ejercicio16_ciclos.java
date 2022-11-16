/*Pide un número entre 0 y 10 y mostrar la tabla de multiplicar de dicho número 

 */
package ejercicio16_ciclos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio16_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int numero, multiplicacion; 
        System.out.println("Ingrese un número entre 0 y 10: ");
        numero = entrada.nextInt();
        
        for(int contador = 1; contador <= 10; contador += 1){
            multiplicacion = numero * contador;
            System.out.println(numero+" X "+contador+" = "+multiplicacion);   
        }
    }
    
}
