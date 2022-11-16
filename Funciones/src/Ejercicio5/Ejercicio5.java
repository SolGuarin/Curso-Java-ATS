/*
Crea una función que devuelva un número aleatorio, entre dos números enteros
que nosotros les demos.
 */
package Ejercicio5;

public class Ejercicio5 {
    public static void main (String [] args){
       
        
        System.out.println("El número aleatorio es: "+numeroAleatorio(3, 8));
        
    }
    
    public static int numeroAleatorio(int minimo, int maximo){
        int aleatorio = (int) (Math.random()*(maximo - minimo)+minimo);
        return aleatorio;
    }
}
