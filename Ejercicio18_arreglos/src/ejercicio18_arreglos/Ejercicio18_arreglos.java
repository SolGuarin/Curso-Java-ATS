/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18_arreglos;

/**
 *
 * @author Usuario
 */
public class Ejercicio18_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo [] = {49,1,3,200,2,4,70,5};
        int ordenado [] = new int [8];
        int conteoSecuencia=0;
        int y=0;
        int numeroMenor = arreglo[0];
        int numeroMenor2 = arreglo [1];
        
        
        for(int i=1; i<arreglo.length;i++){
            if (arreglo[i]<numeroMenor){
                numeroMenor = arreglo[i];
                System.out.println("Número menor es: "+numeroMenor);
            }
        }
        
        for(int i=2; i<arreglo.length;i++){
            if (arreglo[i]<numeroMenor2){
                numeroMenor2 = arreglo[i];
                System.out.println("Número meno 2 es: "+numeroMenor2);
            }
        }
        
        for(int i=0; i<arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
        
    
    }
}
