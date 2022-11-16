/*Pedir 10 números y escribir la suma total
 */
package ejercicio10_ciclos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio10_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int numero, contador = 0, suma = 0;
        
        System.out.println("Ingrese un número: ");
        numero = entrada.nextInt();
        suma = numero + suma; //suma el primer número
        
        while(contador >=0 & contador <9){ 
            System.out.println("Ingrese otro número: ");
            numero = entrada.nextInt();
            contador = contador + 1; 
            suma = numero + suma;  
        }
        
        System.out.println(suma);
    }
    
}
