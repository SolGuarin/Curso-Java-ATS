/*Crear un programa que lea por teclado una tabla de 10 números enteros y 
desplace N posiciones en el arreglo (N es digitado por el usuario
 */
package ejercicio10_arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio10_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int posiciones, ultimo;
        int arreglo [] = new int [10];
        
        for(int i=0; i<10; i++){
            System.out.print("Ingrese el número "+(i+1)+": ");
            arreglo[i] = entrada.nextInt();
        }
        ultimo = arreglo[9];
        System.out.println("¿Cuántas posiciones desea desplazar en el arreglo ");
        posiciones = entrada.nextInt();
        
        
        for(int i=9; i>0; i=i-posiciones){
            arreglo[i]=arreglo[i-posiciones]; 
        }
        
        arreglo[0] = ultimo;
        System.out.println("La nueva lista es: ");
        for(int i:arreglo){
            System.out.println(i);
        }
    }
    
}
