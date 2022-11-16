/*Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayúscula 
 */
package ejercicio3_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio3_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char caracter;
        
        caracter = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        
        if(Character.isUpperCase(caracter)){
            JOptionPane.showMessageDialog(null, "La letra "+caracter+" es mayúscula");
        }
        else{
           JOptionPane.showMessageDialog(null, "La letra "+caracter+" es minúscula"); 
        }
        
        
    }
    
}
