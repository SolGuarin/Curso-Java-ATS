/*
 Crear y cargar una matriz de tamaño n x m y decir si es simétrica o no.
 */
package ejercicio1_matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio1_matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int matriz [][], nFilas, nColumnas;
        boolean simetrica = true; //Para comprobar si la matriz sigue siendo simétrica
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));
        
        matriz = new int[nFilas][nColumnas];
        
        System.out.println("¡Llene la matriz!");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                System.out.print("Matriz {"+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        //Comprobando si es simétrica
        if(nFilas == nColumnas){
            int i, j;
            i=0;
            while(i<nFilas && simetrica==true){
                j=0;
                while(j<i && simetrica==true){
                    if(matriz[i][j] != matriz [j][i]){
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            } 
            if(simetrica == true){
               JOptionPane.showMessageDialog(null, "La matriz es simétrica"); 
            }
            else{
                JOptionPane.showMessageDialog(null, "La matriz no es simétrica");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "La matriz no es simétrica");
        }
    }
    
}
