/*Diseñar un programa que muestre el producto de los 10 primeros números impares
 */
package ejercicio11_ciclos;

/**
 *
 * @author Usuario
 */
public class Ejercicio11_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int multiplicacion = 1;
        
        for(int contador = 1; contador <20; contador +=2){
            multiplicacion *= contador;
        }
        
        System.out.println("El resultado es: "+multiplicacion);
    }
    
}
