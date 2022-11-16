/*
Crear una función que ns devuelva el factorial de un número entero
 */
package Ejercicio6;

import javax.swing.JOptionPane;

public class Ejercicio6 {
    
    public static void main (String [] args){
        int numero1;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        System.out.println("El factorial de "+numero1+" es: "+factorial(numero1));
        
    }
    public static int factorial(int numero){
        if(numero < 0){
            System.out.println("¡ERROR! No se puede calcular el factorial de un número negativo");
            return -1;
        }
        if(numero == 0 || numero ==1){
            return 1;
        } 
        int resultado = numero;
        for(int i=(numero-1); i>1; i--){
                resultado *=i;
            }
        return resultado;
    }  
}

