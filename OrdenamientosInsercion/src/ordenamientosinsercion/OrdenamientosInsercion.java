/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientosinsercion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class OrdenamientosInsercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int arreglo[], nElementos, pos, aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de elementos: "));
        
        arreglo = new int [nElementos];
        
        System.out.println("Digite los elementos del arreglo");
        for (int i=0; i<nElementos; i++){
            System.out.print((i+1)+": Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        
        //Ordenamiento por inserción
        for(int i=0; i<nElementos; i++){
            pos = i;
            aux = arreglo[i];
            
            while((pos>0) && (arreglo[pos-1]>aux)){
                arreglo[pos] = arreglo [pos-1];
                pos--; // Para que compruebe con todos los números de la izquierda
            }
            
            arreglo[pos] = aux; //para refrescar el número actual
        }
        
        System.out.println("El arreglo en orden ascendente es: ");
        for(int i=0; i<nElementos; i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("\nEl arreglo en orde descendente es: ");
        for(int i=(nElementos-1); i>=0; i--){
            System.out.print(arreglo[i]+" - ");
        }
    }
    
}
