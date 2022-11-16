/*Hacer un programa que lea un número entero y muestre si el número es múltiplo de 10
 */
package ejercicio1_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio1_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        if(numero%10 == 0){
            JOptionPane.showMessageDialog(null, "El numero "+numero+" es múltiplo de 10");
        }
        else{
            JOptionPane.showMessageDialog(null, "El nuúmero "+numero+" no es múltiplo de 10");
        }
    }
    
}
