/*Pedir 3 números y mostrarlos ordenados de mayor a menor 

 */
package ejercicio7_condicionales;

import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class Ejercicio7_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el tecer numero: "));
        
        if((numero1>numero2) & (numero2>numero3)){
            JOptionPane.showMessageDialog(null, "orden: "+numero1+" - "+numero2+" - "+numero3);
        }
        else if((numero1>numero3) & (numero3>numero2)){
            JOptionPane.showMessageDialog(null, "orden: "+numero1+" - "+numero3+" - "+numero2);
        }
        else if((numero2>numero1) & (numero1>numero3)){
            JOptionPane.showMessageDialog(null, "orden: "+numero2+" - "+numero1+" - "+numero3);
        }
        else if((numero2>numero3) & (numero3>numero1)){
            JOptionPane.showMessageDialog(null, "orden: "+numero2+" - "+numero3+" - "+numero1);
        }
        else if((numero3>numero1) & (numero1>numero2)){
            JOptionPane.showMessageDialog(null, "orden: "+numero3+" - "+numero1+" - "+numero2);
        }
        else{
            JOptionPane.showMessageDialog(null, "orden: "+numero3+" - "+numero2+" - "+numero1);
        }
    }
    
}
