/*Hacer un programa que tome dos números y diga si ambos son pares o impares

 */
package ejercicio6_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio6_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));
        
        if(numero1%2 == 0 & numero2%2 == 0){
            JOptionPane.showMessageDialog(null, "ambos numero son pares");
        }
        
        else if(numero1%2 == 0 & numero2%2 != 0){
            JOptionPane.showMessageDialog(null, "El "+numero1+" es par y "+numero2+" es impar");
        } 
        else if(numero1%2 != 0 & numero2%2 == 0){
             JOptionPane.showMessageDialog(null, "El "+numero1+" es impar y "+numero2+" es par");
        }
        else{
            JOptionPane.showMessageDialog(null, "ambos numero son impares");
        }
     }

    
}
