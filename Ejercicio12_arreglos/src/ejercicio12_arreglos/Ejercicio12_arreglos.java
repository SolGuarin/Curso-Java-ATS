/*Leer por teclado una tabla de 10 elementos numéricos enteros y una posición
(entre 0 y 9): Eliminar el elemento situado en la posición dada sin dejar huecos.
 */
package ejercicio12_arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio12_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int arreglo[]=new int[10];
        int posicion;
        
        System.out.println("Usted debe ingresar 10 números");
        for(int i=0;i<10;i++){
            System.out.print("Ingrese el número "+(i)+": ");
            arreglo[i]=entrada.nextInt();
        }
        
        System.out.println("¿Qué posición desea eliminar?");
        posicion=entrada.nextInt();
        
        for(int i=posicion;i<9;i++){
            arreglo[i]=arreglo[i+1];
        }
        
        System.out.println("La lista queda: ");
        for(int i=0;i<9;i++){
            System.out.println(arreglo[i]);
        }
    }
    
}
