/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19_arreglos;

/**
 *
 * @author Usuario
 */
public class Ejercicio19_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] arreglo = new int[] { 5, 4, 3, 8, 32, 768, 564, 95, 172, 1500, 859, 754 };
  
         int aux;
         
         for(int i=0; i<(arreglo.length-1); i++){
             for(int j=0; j<(arreglo.length-1); j++){
                 if(arreglo[j]>arreglo[j+1]){
                     aux = arreglo[j];
                     arreglo[j] = arreglo [j+1];
                     arreglo[j+1] = aux;
                 }
             }
         }
         
         System.out.println("El arreglo en forma ordena es: ");
         for(int i=0; i<arreglo.length; i++){
             System.out.print(arreglo[i]+" - ");
         }

    }
    
}
