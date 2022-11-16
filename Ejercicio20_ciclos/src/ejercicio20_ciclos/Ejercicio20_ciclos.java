/*Pedir un número N, introducir N sueldos y mostrar el sueldo máximo

 */
package ejercicio20_ciclos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio20_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero, sueldo, contador = 1, sueldoMayor = 0;
        
        System.out.println("Ingrese un número: ");
        numero = entrada.nextInt();
        
        while(contador <= numero){
            System.out.println("Ingrese sueldo N° "+contador);
            sueldo = entrada.nextInt();
            contador ++;
            
            if(sueldo>sueldoMayor){
                sueldoMayor = sueldo;
            }
        }
        
        System.out.println("El salario mayor es: "+sueldoMayor);
        
    }
    
}
