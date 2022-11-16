/*
Crea una función que nos devuelva en número ASCII de un caracter pasadao por
un parámeto
 */
package Ejercicio4;

public class Ejercicio4 {
    public static void main(String [] args){
        
        char caracter = '4';
        System.out.println("El caracter '"+caracter+"' tiene asociado el código "+devuelveCodigoASCII(caracter));
    }
    
    public static int devuelveCodigoASCII(char caracter){
        return (int)caracter;
    }
    
}
