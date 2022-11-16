/*Leer 5 elementos numéricos que se introducirán ordenados de forma creciente.
estos los guardaremos en una tabla de tamaño 10. Leer un número N, e insertarlo
en el lugar adecuado para que la tabla continue ordenada.
 */
package ejercicio11_arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio11_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int numero, sitio_numero=0, j=0;
        int arreglo[]=new int[10];
        boolean creciente=true;
        
        System.out.println("Digite 5 números odenados de forma creciente: ");
        
        do{
            for(int i=0; i<5; i++){
                System.out.print("Digite el número "+(i+1)+": ");
                arreglo[i]=entrada.nextInt();
            }
            for(int i=0; i<4; i++){
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
        
        System.out.println("\n Digite un nuevo elemento para insertar en el arreglo:");
        numero = entrada.nextInt();
        
        while(arreglo[sitio_numero]<numero && sitio_numero<5){
            sitio_numero++;
        }
        
        for(int i=4; i>=sitio_numero;i--){
            arreglo[i+1] = arreglo[i];
        }
        
        arreglo[sitio_numero]=numero;
        
        System.out.print("\nEl arreglo queda: ");
        for(int i=0;i<6;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
        
        
        /*
        for(int i=0; i<5; i++){
            System.out.println("Digite el número "+(i+1)+": ");
            arreglo[i]=entrada.nextInt();
        }
        
        for(int i=0; i<5; i++){
            if(arreglo[i]<arreglo[i+1]){
                System.out.println("Digite un nuevo número que desee ingresar en la lista");
                numero=entrada.nextInt();
            }
            else{
                System.out.println("¡ERROR! Digite los números ordenados en forma creciente");
            }
        }
        */
    }
    
}
