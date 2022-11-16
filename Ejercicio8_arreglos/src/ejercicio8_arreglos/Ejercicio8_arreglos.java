/*Diseñar una aplicación que declare una tabla de 10 elementos enteros.
Leer mediante el teclado 8 números. Después se debe pedir un número y una 
posición, insertarlo en la posición indicada, desplazando los que están detrás. 

 */
package ejercicio8_arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio8_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int posicion, numero;
        
        int listaNumeros[] = new int[10];
        
        System.out.println("Usted debe digitar 8 números:");
        
        for(int i=0; i<9; i++){
            System.out.print("Digite el número "+(i+1)+": ");
            listaNumeros[i] = entrada.nextInt();
        }
        
        System.out.println("Posición en que desea ingresar un nuevo número: ");
        posicion = entrada.nextInt();
        System.out.println("Número que desea ingresar: ");
        numero = entrada.nextInt();
        

        
        for(int i=9; i>posicion; i--){
           listaNumeros[i] = listaNumeros[i-1];
        }
        
        listaNumeros[posicion] = numero;
        
        System.out.println("\nLa nueva lista es: ");
        for(int i:listaNumeros){
            System.out.println(i);
        }
    }   
}
