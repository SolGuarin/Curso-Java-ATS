/*Hacer un programa que calcule el cuadrado de una suma 

 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float numero1, numero2, resultado, cuadrado, raiz;
        
        System.out.println("Ingrese el primer número: ");
        numero1 = entrada.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        numero2 = entrada.nextInt();
        
        resultado = numero1 + numero2;
        
        cuadrado = (float)Math.pow(resultado, 2);
        
        raiz = (float)Math.sqrt(resultado);
        
        System.out.println("La suma da: "+resultado);
        System.out.println(resultado+" elevado al cuadrado da: "+cuadrado);
        System.out.println("La raiz cuadrada de "+cuadrado+" es: "+raiz);
    }
    
}
