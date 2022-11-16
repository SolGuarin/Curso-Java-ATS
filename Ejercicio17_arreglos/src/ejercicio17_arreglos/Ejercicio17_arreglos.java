/*escribir un programa para encontrar el segundo elemento más grande en una matriz
 */
package ejercicio17_arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio17_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int arreglo[] = {1,2,3,45,65,70,3,4,5,1,1};
        int numeroMayor = arreglo[0];
        int segundoMayor= arreglo[0];
        
        //Se llenael arreglo
        //System.out.println("Debe registrar 10 números");
        //for(int i=0; i<10;i++){
           // System.out.println("Ingrese el número "+i+": ");
            //arreglo[i] = entrada.nextInt();
        //}
        
        // se encuentra el número mayor
        int y=0;
        for(int i=1; i<arreglo.length;i++){
            if (arreglo[i]>numeroMayor){
                numeroMayor = arreglo[i];
                y++;
            }
        }
        arreglo[y] = 0;
        
        for(int i=0; i<arreglo.length;i++){
            if(arreglo[i]>segundoMayor){
                segundoMayor = arreglo[i];
            }
        }
        
        System.out.println("El número mayor es "+numeroMayor);
        System.out.println("El segundo númeo mayor es: "+segundoMayor);
    }
    
}
