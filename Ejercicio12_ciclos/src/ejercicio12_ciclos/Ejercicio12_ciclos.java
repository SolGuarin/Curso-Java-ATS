/*Pedir un número y calcular su factorial
N! = 1*2*3…N

 */
package ejercicio12_ciclos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio12_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int numero, factorial= 1;
        
        System.out.println("Ingrese un número: ");
        numero = entrada.nextInt();
        
        while(numero>0){
            factorial *=numero;
            numero -=1;
            
        }
        
        System.out.println("El factorial es: "+factorial);
    }
    
}
