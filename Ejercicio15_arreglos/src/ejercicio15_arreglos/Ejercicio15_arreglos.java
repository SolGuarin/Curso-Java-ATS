/*Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla, 
se debe mostrar la posición en que se encuentra. Si no está, indicarlo con 
un mensaje.
 */
package ejercicio15_arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio15_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int arreglo[] = new int [10];
        boolean creciente=true, encontrado=false, noEncontrado=false;
        int numero, posicion=0;
        
        System.out.println("Digite 10 números odenados de forma creciente: ");
        
        do{
            for(int i=0; i<10; i++){
                System.out.print("Digite el número "+i+": ");
                arreglo[i]=entrada.nextInt();
            }
            for(int i=0; i<9; i++){
                 if(arreglo[i]<arreglo[i+1]){
                     creciente = true;
                 }
                 if(arreglo[i]>arreglo[i+1]){
                     creciente = false;
                     break;
                 }
            }  
            if(creciente == false){
                System.out.println("\n¡ERROR! El arreglo no está ordenado de forma creciente, digite nuevamente:\n");
            }
        }while(creciente == false);
        
        System.out.println("¿Qué número desea buscar?");
        numero = entrada.nextInt();

        int i=0;
        
        while(i<10){
            if(numero == arreglo[i]){
                encontrado = true;
                posicion = i;
            } 
            i++;   
        }
        if(encontrado==true){
            System.out.println("El número "+numero+" está ubicado en la posición "+posicion);
        }
        else{
            System.out.println("Número no encontrado");
        }
        
    }
}
