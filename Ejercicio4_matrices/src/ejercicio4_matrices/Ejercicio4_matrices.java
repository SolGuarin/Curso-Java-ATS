/*
Crear una matriz de tamaño 7x7 y rellenarla de forma que los elementos de la 
diagonal principal sean 1 y el resto 0.
 */
package ejercicio4_matrices;

/**
 *
 * @author Usuario
 */
public class Ejercicio4_matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz [][] = {{1,0,0,0,0,0,0},{0,1,0,0,0,0,0},{0,0,1,0,0,0,0},{0,0,0,1,0,0,0},{0,0,0,0,1,0,0},{0,0,0,0,0,1,0},{0,0,0,0,0,0,1}};
        
        
        System.out.println("MATRIZ");
        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
}
