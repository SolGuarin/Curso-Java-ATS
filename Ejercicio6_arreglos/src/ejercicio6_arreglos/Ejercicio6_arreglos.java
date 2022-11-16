/*Leer los datos correspondientes a dos tablas de 12 elementos numéricos, 
y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la tabla B, 
otros 3 de la A, otros 3 de la B, etc…
 */
package ejercicio6_arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio6_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int arregloA [] = new int[12];
        int arregloB [] = new int [12];
        int arregloC [] = new int [24];
        
        System.out.println("Ingrese el primer arreglo");
        for(int i=0; i<12; i++){
            System.out.print("Ingrese el número "+(i+1)+": ");
            arregloA[i] = entrada.nextInt();
        }
        
        System.out.println("Ingrese el segundo arreglo: ");
        for(int i=0; i<12; i++){
            System.out.print("Ingrese el número "+(i+1)+": ");
            arregloB[i] = entrada.nextInt();
        }
        int j=0;
        for(int i=0; i<12; i=i+3){
        arregloC[j] = arregloA[i];
        j++;
        arregloC[j] = arregloA[i+1];
        j++;
        arregloC[j] = arregloA[i+2];
        j++;
        arregloC[j] = arregloB[i];
        j++;
        arregloC[j] = arregloB[i+1];
        j++;
        arregloC[j] = arregloB[i+2];
        j++;
        }
        System.out.println("\nEl tercer arreglo es: ");
        for(int i:arregloC){
            System.out.print(i+" ");
        }
        
        System.out.println(); 
    }
    
}
