/*
Crear una función que nos devuelva la suma de un array y otra que nos devuelva la media
 */
package Ejercicio9;

public class Ejercicio9 {
    public static void main(String [] args){
        int numeros[] = {1,2,3,4,5};
        
        System.out.println("La suma es: "+suma(numeros));;
        System.out.println("El promedio es: "+promedio(numeros));
    }
    
    public static int suma(int[] array){
        int suma=0;
        for(int i=0; i<array.length; i++){
        suma = suma +array[i];
        }
        return suma;
    }
    
    public static double promedio(int [] array){
        int suma = suma(array);
        return suma/array.length;
    }
}
