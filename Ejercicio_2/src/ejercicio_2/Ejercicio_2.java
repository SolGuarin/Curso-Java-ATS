/*Hacer un programa que calcule e imprima el salario semanal de un empleado
a partir de sus horas semanales trabajas y de su salario por hora
 */
package ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int salarioPorHora, horasTrabajadas, salarioSemanal;
        
        System.out.println("Cuánto gana por hora: ");
        salarioPorHora = entrada.nextInt();
        
        System.out.println("Cuántas horas trabaja por semana: ");
        horasTrabajadas = entrada.nextInt();
        
        salarioSemanal = salarioPorHora * horasTrabajadas;
        
        System.out.println("Su salario semanal es: "+salarioSemanal);
       
        
    }
    
}
