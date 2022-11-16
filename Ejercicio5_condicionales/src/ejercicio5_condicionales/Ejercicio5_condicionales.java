/*Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
-si trabaja 40 horas o menos se le paga 16000$ por hora
-si trabaja más de 40 horas, se le paga 16000$ por cada 
una de las primeras 40 horas y 20000$ por cada hora extra 
 */
package ejercicio5_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio5_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horasTrabajadas, salario;
        
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de horas trabajadas"));
        
        if(horasTrabajadas<=40){
            salario = horasTrabajadas * 16000;
            
        }
        else{
            salario = (40 * 16000) + ((horasTrabajadas-40)*20000);
        }
        
        JOptionPane.showMessageDialog(null, "Su salario semanal es: "+salario);
    }
    
}
