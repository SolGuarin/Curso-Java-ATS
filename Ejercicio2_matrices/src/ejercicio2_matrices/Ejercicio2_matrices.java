/*
 Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma
 */
package ejercicio2_matrices;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2_matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada =  new Scanner (System.in);
        int matriz1 [][]= new int [3][3];
        int matriz2 [][]= new int [3][3];
        int sumaMatriz [][] = new int [3][3];
        
        System.out.println("¡Llene la matriz 1");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("¡Llene la matriz 2");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz2[i][j] = entrada.nextInt();
            }
        }
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                sumaMatriz [i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        System.out.println("La suma de las matrices es: ");
        for(int i=0; i<3; i++){// número de filas
            for (int j=0; j<3; j++){ // número de columnas 
                System.out.print(sumaMatriz[i][j]);
            }
            System.out.println("");
    }
    
}
}
