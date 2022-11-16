/*
 Crear una función que nos indique si un número es primo o no
 */
package Ejercicio7;

import javax.swing.JOptionPane;
public class Ejercicio7 {
    public static void main(String [] args){
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
       
        if(esPrimo(numero)==true){
           System.out.println("El numero "+numero+" es primo");
       }
        if(esPrimo(numero)==false){
           System.out.println("El numero "+numero+" no es primo"); 
        }
    }
    
    public static boolean esPrimo(int numero){
        if(numero<=1){
            return false;
        }
        for (int i= (int)Math.sqrt(numero);i>1;i--){
            if(numero%i==0){
                return false;
            }
        }
        return true;

        }   
}
