/*Escribir los números del 100 al 0 de 7 en 7

 */
package ejercicio9_ciclos;

/**
 *
 * @author Usuario
 */
public class Ejercicio9_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int contador = 100;
        
        while(contador<=100 & contador>0){
            
            System.out.println(contador);
            contador = contador - 7;
            
        }
        
    }
    
}
