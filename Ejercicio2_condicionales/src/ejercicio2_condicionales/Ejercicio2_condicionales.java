/*Pedir dos números y decir cuál es mayor o si son iguales.
.
 */

package ejercicio2_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio2_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));
        
        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null, "El "+numero1+" es mayor que "+numero2);
        
        }
        else if(numero2 > numero1){
            JOptionPane.showMessageDialog(null, "El "+numero2+" es mayor que "+numero1);
        }
        else{
            JOptionPane.showMessageDialog(null, "Los números son iguales");
        }
    }
    
}
