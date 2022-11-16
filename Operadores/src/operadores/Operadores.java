/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*   
        //OPERADORES
        
        Scanner entrada = new Scanner(System.in);
        float numero1, numero2, suma, resta, mult, div, resto;
        
        System.out.print("Digite dos números:");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        
        suma = numero1+numero2;
        resta = numero1-numero2;
        mult = numero1*numero2;
        div = numero1/numero2;
        resto = numero1%numero2; 
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+mult);
        System.out.println("La división es: "+div);
        System.out.println("El residuo es: "+resto);

        
        // OPERADORES COMBINADOS CON ASIGNACIÓN
        
        int numero = 10;
        
        numero += 5; //numero = numero +5;
        numero -= 5;
        numero *= 5;
        numero /= 5;
        numero %= 5;
        
        System.out.println(numero);
*/
     
     //OPERADORES DE INCREMENTO Y DECREMENTO 
     
        int x = 5, y;
        
        x++; // x +=1;        
        x--; // x -=1;
        
        y = x++; 
        y = ++x;
         
        System.out.println(y);
     
        
    }
    
}
