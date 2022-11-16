/*
Crear una función que muestre por pantalla un array que hayamos creado
 */
package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[]args){
        
        Scanner entrada = new Scanner (System.in);
        
        int numeros[]=new int[5];
        
        System.out.println("Llene el arreglo");
        for(int i=0; i<5; i++){
            System.out.print((i+1)+": Digite un número: ");
            numeros[i] = entrada.nextInt();
        }
        
        mostrar(numeros);      
    }
    public static void mostrar(int[] array){
        System.out.println("El arreglo es: ");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
