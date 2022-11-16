/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13_arreglos_solucion2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio13_arreglos_solucion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int arreglo[] = new int [10];
        int conteo_pares=0, conteo_impares=0;
        int arregloPares[] = new int [conteo_pares];
        int arregloImpares[] = new int [conteo_impares];
        
        for(int i=0;i<10;i++){
            System.out.println("Digite el número "+i+": ");
            arreglo[i]=entrada.nextInt();
            
            if(arreglo[i]%2==0){   conteo_pares++;
            }
            else{ 
                conteo_impares++;
            }
        }
        conteo_pares=0;
        conteo_impares=0;
        
        for(int i=0;i<10;i++){
            if(arreglo[i]%2==0){
                arregloPares[conteo_pares]=arreglo[i];
                conteo_pares++;
            }
            else{
                arregloImpares[conteo_impares]=arreglo[i];
                conteo_impares++;
            }
        }
        
        System.out.println("\n Arreglo pares es: ");
        for(int i:arregloPares){
            System.out.print(i+"-");
        }
        System.out.println("\n Arreglo impares es: ");
        for(int i:arregloImpares){
            System.out.print(i+"-");       
            
        }
    }
    
}
