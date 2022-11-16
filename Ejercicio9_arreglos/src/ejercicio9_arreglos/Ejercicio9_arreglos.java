/*Crear un programa que lea por teclado una tabla de 10 números enteros y la 
desplace una posición hacia abajo: el primero pasa a ser el segundo, el segundo
pasa a ser el tercero y así sucesivamente. El último pasa a ser el primero.
 */
package ejercicio9_arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio9_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int ultimo;
        int arreglo [] = new int[10];
        
        System.out.println("Usted debe ingresar 10 números");
        String arregloAntesStr = ""; 
        for(int i=0; i<10; i++){
            System.out.print("Ingrese el número "+(i+1)+": ");
            arreglo[i] = entrada.nextInt();
            arregloAntesStr += arreglo[i] + " ";
        }
        
        ultimo = arreglo[9];
        
        for(int i=9;i>0;i--){
            arreglo[i]=arreglo[i-1];
            
        }
        System.out.println("Antes: ");
        System.out.println(arregloAntesStr);
        
        arreglo[0] = ultimo;
        System.out.println("\nLa nueva lista es: ");
        
        String arregloStr = "";
        for(int i:arreglo){
            arregloStr += i + " ";
        }

        System.out.println("Despues: ");
        System.out.println(arregloStr);
        
        
        
    }
    
}
