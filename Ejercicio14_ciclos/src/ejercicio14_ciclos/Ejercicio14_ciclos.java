/*Pedir 10 sueldos, mostrar su suma y cuántos hay mayores de 100000$

 */
package ejercicio14_ciclos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio14_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        /*
        int contador = 0; 
        float sueldo;
        int contador2 = 0;
        float suma = 0;
        
        while(contador < 10){
            System.out.println("Ingrese un sueldo: ");
            sueldo = entrada.nextFloat();
            suma = suma + sueldo;
            contador += 1;
            
            if (sueldo > 100000){
                contador2 += 1;
            }
        }
        
        System.out.println("La suma de todos los salarios es: "+suma);
        System.out.println("Hay "+contador2+" salarios mayores de 100000$");

        */
        
        int suma = 0;
        int salario;
        int contador2 = 0;
        
        for(int contador = 0; contador <10; contador +=1){
            System.out.println("Ingrese un salario: ");
            salario = entrada.nextInt();
            suma = suma + salario;
            
            if(salario>100000){
                contador2 += 1;
            }
        }
        System.out.println("La suma de todos los salarios es: "+suma);
        System.out.println("Hay "+contador2+" salarios mayores de 100000$");
        
                
    }
    
    
}
