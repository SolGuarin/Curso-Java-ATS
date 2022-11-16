/*
Crea una función que indique si un número es mayor o menor que 0
 */
package Ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    
    public static boolean verificar(int numero){
        if(numero >0){
            System.out.println("El número es mayor a 0");
            return true;
        }
            System.out.println("El numero es menor a 0");
            return false;
          
    }
    
    public static void main (String [] args){
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        verificar(numero);
    }
    
}
