/*Leer por teclado una serie de 10 números enteros. La aplicación debe 
indicarnos si los números están ordenados de forma creciente o decreciente, 
o si están desordenados. 
 */
package ejercicio7_arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio7_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int numeros[] = new int [10];
        boolean creciente=false, decreciente=false, iguales=false;
        
        System.out.println("Debe ingresar 10 números");
        for(int i=0; i<10; i++){
            System.out.println("Ingrese el número "+(i+1)+" ");
            numeros[i] = entrada.nextInt();
        }
        
        for(int i=0; i<9; i++){
            if(numeros[i]<numeros[i+1]){
                creciente = true;
            }
            if(numeros[i]>numeros[i+1]){
                decreciente = true;
            }
            if(numeros[i]==numeros[i+1]){
                iguales = true;
            }
        }
        
        if(creciente==true && decreciente==false){
            System.out.println("La lista está ordenada de forma creciente");
        }
        else if(creciente==false && decreciente==true){
            System.out.println("La lista está ordenada de forma decreciente");
        }
        else if(creciente==true && decreciente==true){
            System.out.println("La lista está desordenada");
        }
        else if(iguales==true){
            System.out.println("Todos los números de la lista son iguales");
        }
            
    } 
}
    

