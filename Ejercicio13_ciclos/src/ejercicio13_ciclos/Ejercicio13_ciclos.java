/*Pedir 10 números, mostrar la media de los números negativos, 
la media de los números positivos y la cantidad de ceros.

 */
package ejercicio13_ciclos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio13_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int numero, contador = 1;
        int contadorPositivos = 0;
        int sumaPositivos = 0;
        int promedioPositivos;
        int contadorNegativos = 0; 
        int sumaNegativos = 0; 
        int promedioNegativos;
        int totalCeros = 0;
        
        while(contador <= 10){
            System.out.println("Ingrese un número: ");
            numero = entrada.nextInt();
            contador +=1 ;
            
            if (numero > 0){
                sumaPositivos = sumaPositivos + numero;
                contadorPositivos +=1;
            }
            else if(numero < 0){
                sumaNegativos = sumaNegativos + numero;
                contadorNegativos += 1;
            }
            else{
                totalCeros += 1;
            }  
        }
        
        promedioPositivos = sumaPositivos / contadorPositivos;
        promedioNegativos = sumaNegativos / contadorNegativos;
        
        System.out.println("El promedio de los números positivos es: "+promedioPositivos);
        System.out.println("El promedio de los números negativos es: "+promedioNegativos);
        System.out.println("El total de ceros es: "+totalCeros);
        
    }
    
}
