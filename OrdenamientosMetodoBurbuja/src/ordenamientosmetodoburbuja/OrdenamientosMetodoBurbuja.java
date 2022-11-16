
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientosmetodoburbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class OrdenamientosMetodoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int arreglo [], nElementos, aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de elementos: "));
        
        arreglo = new int [nElementos]; //asignamos el número de elementos del arreglo
        
        for (int i=0; i<nElementos; i++){
            System.out.print((i+1)+": Digite los elementos del arreglo: ");
            arreglo[i] = entrada.nextInt();
        }
        
        
        //Método burbuja 
        
        for (int i=0; i<(nElementos-1); i++){
            for (int j=0; j<(nElementos-1);j++){
                if (arreglo[j]>arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo [j+1] = aux;
                    
                }
            }
        }
        
        System.out.println("El arreglo ordenado en forma creciente es: ");
        for (int i=0; i<nElementos; i++){
            System.out.print(arreglo[i]+" - ");
        }
        
        System.out.println("\nArreglo ordenado en forma decreciente es: ");
        for( int i=(nElementos-1); i>=0; i--){
            System.out.print(arreglo[i]+" ");
        }
    }
    
}
