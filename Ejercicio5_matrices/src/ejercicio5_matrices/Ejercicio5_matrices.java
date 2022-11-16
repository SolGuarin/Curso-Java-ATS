/*
Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila 
y de cada columna
.
 */
package ejercicio5_matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio5_matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int matriz [][], nFilas, nColumnas, sumaFilas, sumaColumnas;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));
        
        matriz = new int [nFilas][nColumnas];
        
        System.out.println("Llene la matriz: ");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz [i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("La matriz es: ");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                System.out.print(matriz[i][j]+" ");
            }
            
            System.out.println(" ");
        }
        
        //Suma de filas 
        for(int i=0; i<nFilas; i++){
            sumaFilas = 0;
            for(int j=0; j<nColumnas; j++){
                sumaFilas += matriz[i][j];
            }
            System.out.print("\n la suma de la fila ["+i+"] es: "+sumaFilas);
        }
        System.out.println("");
        
        //Suma de columnas
        for(int j=0; j<nColumnas; j++){
            sumaColumnas = 0;
            for(int i=0; i<nFilas; i++){
                sumaColumnas += matriz[i][j];
            }
            System.out.print("\n la suma de la columna ["+j+"] es: "+sumaColumnas);
        }
        System.out.println("");
        
        
    }
    
}
