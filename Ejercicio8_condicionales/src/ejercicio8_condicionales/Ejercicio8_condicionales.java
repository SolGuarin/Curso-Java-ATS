/*Pedir un número entre 0 y 99 999 y decir cuántas cifras tiene 
 */
package ejercicio8_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio8_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entre 0 y 99999"));
        
        if(numero>0 & numero<=9){
            JOptionPane.showMessageDialog(null, "El número tiene una cifra");
        }
        else if(numero>9 & numero<=99){
            JOptionPane.showMessageDialog(null, "El número tiene dos cifras");
        }
        else if(numero>99 & numero<=999){
            JOptionPane.showMessageDialog(null, "El número tiene tres cifras");
        }
        else if(numero>999 & numero<=9999){
            JOptionPane.showMessageDialog(null, "El número tiene cuatro cifras");
        }
        else{
            JOptionPane.showMessageDialog(null, "El número tiene cinco cifras");
        }
    }
    
}
