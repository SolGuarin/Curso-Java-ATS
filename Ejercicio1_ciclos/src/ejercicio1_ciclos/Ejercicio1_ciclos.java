/*Leer un número y mostrar su cuadrado, repetir el proceso hasta que se 
introduzca un número negativo.

 */
package ejercicio1_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio1_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero, cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        
        while(numero>=0){
            cuadrado = (int)Math.pow(numero, 2);
            JOptionPane.showMessageDialog(null, "El cudrado de "+numero+" es: "+cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
    }
    
}
