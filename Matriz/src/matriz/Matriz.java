
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int matriz [] [] = {{1,2,3},{4,5,6},{7,8,9}}; para llenarlo manualmente 
        
        //Llenar pidiendo loa datos al usuario
        Scanner entrada = new Scanner (System.in);
        int matriz [][], nFilas, nColumnas;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));
        
        matriz = new int [nFilas][nColumnas];
        
        System.out.println("¡LLene la matriz!");
        for(int i=0; i<nFilas; i++){
            for (int j=0; j<nColumnas; j++){
                System.out.println("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        //Imprimir la matriz
        
        for(int i=0; i<3; i++){// número de filas
            for (int j=0; j<3; j++){ // número de columnas 
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
}
