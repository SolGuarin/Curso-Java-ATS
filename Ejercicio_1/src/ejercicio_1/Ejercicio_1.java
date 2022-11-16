/*Hacer un programa que calcule e imprima y la suma de tres calificaciones
 */
package ejercicio_1;

import java.util.Scanner;


public class Ejercicio_1 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner (System.in);
        float calificacion1, calificacion2, calificacion3;
        float notaDefinitiva;
        
        System.out.println("Ingrese sus calificaciones: ");
        calificacion1 = entrada.nextFloat();
        calificacion2 = entrada.nextFloat();
        calificacion3 = entrada.nextFloat();
        
        notaDefinitiva = calificacion1 + calificacion2 + calificacion3;
        
        System.out.println("La suma de sus notas es: "+notaDefinitiva);
        
        
        
                
    }
    
}
