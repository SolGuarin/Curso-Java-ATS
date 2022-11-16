/*Leer un número, indicar si es negativo o positivo.
El proceso se repetirá hasta que se introduzca un 0.

 */
package ejercicio2_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio2_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(numero!=0){
            if(numero>0){
                JOptionPane.showMessageDialog(null, "El "+numero+" es positivo");
            }else{
                JOptionPane.showMessageDialog(null, "El "+numero+" es negativo");
            }
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        }
    }
    
}
