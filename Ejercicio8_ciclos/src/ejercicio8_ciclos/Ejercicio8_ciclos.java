/*Pedir un número N y mostrar todos los números del 1 hasta N
 */
package ejercicio8_ciclos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio8_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int numero, contador = 0;
        
        System.out.println("Ingrese un número: ");
        numero = entrada.nextInt();
        
        
        while(contador<=numero){
            System.out.println(contador);
            contador = contador + 1;
        }
    }
    
}
