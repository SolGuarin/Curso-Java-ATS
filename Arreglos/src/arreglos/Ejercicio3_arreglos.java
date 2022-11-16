/*Leer 5 números por teclado, almacenarlos en un arreglo y a continuación 
realizar la media de los números positivos, la media de los negativos y 
contar el número de ceros

 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3_arreglos {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        
        int contCero, sumaPositivos=0, sumaNegativos=0, promedioPositivos, promedioNegativos;
        
        int numeros [] = new int [5];
        
        System.out.println("Usted debe ingresar 5 números: ");
        for(int i=0;1<5;i++){
            System.out.println("Ingrese el número "+(i+1)+": ");
            numeros[i] = entrada.nextInt();
            
            if(numeros<0){
                
                
            }
        }
        
       
    }
    
}
