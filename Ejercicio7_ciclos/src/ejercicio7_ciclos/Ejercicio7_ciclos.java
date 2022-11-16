/*Pedir números hasta que se introduzca uno negativo, y calcular la media.

 */
package ejercicio7_ciclos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio7_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        float numero, suma = 0, promedio;
        int contador = 0;
        
        System.out.println("Ingrese un número: ");
        numero = entrada.nextFloat();
        
        while(numero >=0){
            suma = suma + numero;
            System.out.println("Ingrese otro número: ");
            numero = entrada.nextFloat();
            contador = contador + 1;
        }
        
        promedio = suma/contador;
        
        System.out.println("El promedio de los números ingresados es: "+promedio);
    }
    
}
