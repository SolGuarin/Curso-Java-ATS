/*Leer 10 números enteros, guardarlos en un arreglo. 
Se deben mostrar en el siguiente orden: el primero, el último, el segundo, 
el penúltimo, el tercero etc 
 */
package ejercicio4_arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio4_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int numeros [] = new int [10];
        int numeros2 [] = new int [10];
        
        System.out.println("Debe ingresar 10 números: ");
        
        for(int i=0; i<10; i++){
            System.out.print("Ingrese el número "+(i+1)+": ");
            numeros[i] = entrada.nextInt();
            
        }
        int k=0;
        int j=9;
        while(j>k){
            System.out.println(numeros[k]);
            System.out.println(numeros[j]);
            k++;
            j--;
            
        }
        System.out.println("\nLos números en desorden son: ");

        }
       }
            
    
     
        
 
    /*
        System.out.println("\nLos números en desorden son: ");
        System.out.print(numeros[0]+" ");
        System.out.print(numeros[9]+" ");
        System.out.print(numeros[1]+" ");
        System.out.print(numeros[8]+" ");
        System.out.print(numeros[2]+" ");
        System.out.print(numeros[7]+" ");
        System.out.print(numeros[3]+" ");
        System.out.print(numeros[6]+" ");
        System.out.print(numeros[4]+" ");
        System.out.print(numeros[5]+" ");
*/