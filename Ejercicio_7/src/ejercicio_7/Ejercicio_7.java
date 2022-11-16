/*Construir un programa que, dado un número total de horas, devuelva el número de semanas, días y horas equivalentes. 
Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
 */
package ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
         int horasTotales, semanas, dias, horas; 
        
        System.out.println("Ingrese el número de horas: ");
        horasTotales = entrada.nextInt();
        
        semanas = horasTotales /168;
        dias = horasTotales%168 / 24;
        horas = horasTotales%24;
        
        System.out.println(horasTotales+" son equivalentes a: "+semanas+" semanas, "+dias+" dias y "+horas+" horas");
        
       
    }
    
}
