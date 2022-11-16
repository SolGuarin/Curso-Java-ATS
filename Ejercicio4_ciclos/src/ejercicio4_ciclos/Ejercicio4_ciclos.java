/*Pedir números hasta que se teclee uno negativo y mostrar cuántos números se han introducido.
 */
package ejercicio4_ciclos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio4_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int numero, iterador = 1;
        
        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();
        
        while(numero>0){  
            System.out.println("Ingrese otro numero: ");
            numero = entrada.nextInt();
            iterador = iterador +1;                  
        }
        System.out.println("Usted ha ingresado "+iterador+" números");
    }
    
}
