/*
 Crear y caragar una matriz 3x3 transponerla y mostrarala
 */
package ejercicio3_matrices;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3_matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int matriz [][] = new int [3][3];
        int matrizTranspuesta [][] = new int [3][3];
        
        System.out.println("LLene la matriz: ");
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz [i][j] = entrada.nextInt();
            }
        }
        
        //Tranponer matriz
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matrizTranspuesta [i][j] = matriz [j][i];
            }
        }
        
        //Matriz que ingreso el usuario
        System.out.println("\nMatriz original");
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){ 
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        //Matriz transpuesta
        System.out.println("La matriz tranpuesta es: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrizTranspuesta[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
