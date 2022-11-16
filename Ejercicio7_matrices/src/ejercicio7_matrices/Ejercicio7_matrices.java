/*
Hacer una matriz “marco” de tamaño 5x5, todos sus elementos deben ser 0 salvo 
los de los bordes que deben ser 1. Mostrarla 
 */
package ejercicio7_matrices;

/**
 *
 * @author Usuario
 */
public class Ejercicio7_matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int matriz [][] = {{1,1,1,1,1},{1,0,0,0,1},{1,0,0,0,1},{1,0,0,0,1},{1,1,1,1,1}};
        
        int matriz [][] = new int [5][5];
        
        //Llenar la matriz
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(i==0 || i==4){
                    matriz[i][j] = 1;
                }
                else if (j==0 || j==4){
                    matriz[i][j] = 1;  
                }
                else{
                   matriz[i][j] = 0;  
                }
            }
        }
        
        System.out.println("La atriz es: ");
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(matriz [i][j]+"  ");
            }
            System.out.println("");
        }
    }
    
}
