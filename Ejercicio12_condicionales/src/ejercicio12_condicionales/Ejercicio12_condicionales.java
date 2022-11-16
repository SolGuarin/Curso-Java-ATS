/*Pedir una nota de 0 a 10, y mostrar la de la forma, 
Insuficiente, Suficiente, Bien, Notable y Sobresaliente.

 */
package ejercicio12_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio12_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota;
        
        nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su nota: "));
        
        if(nota >=0 & nota <=2){
            JOptionPane.showMessageDialog(null, "Su calificación es INSUFICIENTE: "+nota);
        }
        else if(nota>2 & nota<=4){
            JOptionPane.showMessageDialog(null, "Su calificación es SUFICIENTE: "+nota);
        }
        else if(nota>4 & nota<=6){
            JOptionPane.showMessageDialog(null, "Su calificación es BIEN: "+nota);
        }
        else if(nota>6 & nota<=8){
            JOptionPane.showMessageDialog(null, "Su calificación es NOTABLE: "+nota);
        }
        else{
            JOptionPane.showMessageDialog(null, "Su calificación es SOBRESALIENTE: "+nota);
        }
            
    }
    
}
