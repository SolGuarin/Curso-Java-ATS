/*Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo, 
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. 
Hacer un programa que calcule e imprima la cantidad de dinero que 
tienen entre los tres.
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int cantidadGuillermo, cantidadLuis, cantidadJuan, total;
        
        System.out.println("¿Cuántos dólares tiene Guillermo?: ");
        cantidadGuillermo = entrada.nextInt();
        
        cantidadLuis = cantidadGuillermo / 2;
        cantidadJuan = (cantidadGuillermo + cantidadLuis) / 2;
        total = cantidadGuillermo + cantidadLuis + cantidadJuan;
        
        System.out.println("Guillermo tiene "+cantidadGuillermo+" dólares");
        System.out.println("Luis tiene "+cantidadLuis+" dólares");
        System.out.println("Juan tiene "+cantidadJuan+" dólares");
        System.out.println("Entre los tres tienen "+total+" dólares");
       
              
    }
    
}
