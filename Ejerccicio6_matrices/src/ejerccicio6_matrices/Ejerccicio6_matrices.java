/*
Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y trasponerla 
en la segunda
 */
package ejerccicio6_matrices;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejerccicio6_matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int matriz1 [][] = new int [5][9];
        int matriz2 [][] = new int [9][5];
        
        //Llenar la primera matriz
        System.out.println("Llene la matriz: ");
        for(int i=0; i<5; i++){
            for(int j=0; j<9; j++){
                System.out.print("Matriz ["+i+"] ["+j+"]: "); 
                matriz1 [i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("Matriz original: ");
        for(int i=0; i<5; i++){
            for(int j=0; j<9; j++){
                System.out.print(matriz1[i][j]+" ");
            }
            
            System.out.println("");
        }
        
        for(int i=0; i<9; i++){
            for(int j=0; j<5; j++){
                matriz2[i][j] = matriz1[j][i];
            }
        }
        
        System.out.println("Matriz traspuesta: ");
        for(int i=0; i<9; i++){
            for(int j=0; j<5; j++){
                System.out.print(matriz2[i][j]+" ");
            }
            
            System.out.println("");
        }        
        
        
    }
    
}
