/*Leer por teclado dos tablas de 10 números enteros y mezclarlas en una
tercera de la forma el 1° de A, el 1° de B, el 2° de A, el 2° de B, etc…
 */
package ejercicio5_arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio5_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int arregloA [] = new int[10];
        int arregloB [] = new int [10];
        int arregloC [] = new int [20];
        
        //Pedimos el arreglo a
        System.out.println("Digite el primer arreglo: ");
        for(int i=0; i<10; i++){
            System.out.print("Digite el número "+(i+1)+": ");
            arregloA[i] = entrada.nextInt();
        }
        
        //Pedimos el arreglo b
        System.out.println("\nDigite el segundo arreglo: ");
        for(int i=0; i<10; i++){
            System.out.print("Digite el número "+(i+1)+": ");
            arregloB[i] = entrada.nextInt();
        }
        
        //Mezclar los dos arreglos en arreglo c
        //Iterador i para a y b, iterador j para c
        int j=0;
        for(int i=0; i<10; i++){ //cuando el iterador i avance 1 en el contador copia el 2 de A y B
        arregloC[j] = arregloA[i]; //copia el primer elemento de A
        j++;
        arregloC[j] = arregloB[i]; //copia el primer elemento de B
        j++;
        }
        
        System.out.println("\nEl tercer arreglo es: ");
        for(int i:arregloC){
            System.out.print(i+" ");
        }
        
        System.out.println();
    
    }
}
