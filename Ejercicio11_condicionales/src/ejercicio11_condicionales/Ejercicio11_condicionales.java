/*Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro operaciones aritméticas básicas 
(suma, resta, multiplicación y división). El usuario debe especificar la operación con el primer caracter del primer praámetro de la 
línea de comandos: S o s para la suma, R o r para la resta, M o m para la multiplicación y D o d para la división.

 */
package ejercicio11_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio11_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2, resultado;
        char operador;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        operador = JOptionPane.showInputDialog("Digite la operación que desea realizar: ").charAt(0);
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        
        if(operador == 'S' || operador == 's'){
            resultado = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "La suma es: "+resultado);
        }
        else if (operador == 'R' || operador == 'r'){
            resultado = numero1 - numero2;
            JOptionPane.showMessageDialog(null, "La resta es: "+resultado);           
        }
        else if (operador == 'M' || operador == 'm'){
            resultado = numero1 * numero2;
            JOptionPane.showMessageDialog(null, "La multiplicación es: "+resultado); 
        }
        else if(operador == 'D' || operador == 'd'){
            resultado = numero1/numero2;
            JOptionPane.showMessageDialog(null, "El división es: "+resultado); 
        }
        else{
            JOptionPane.showMessageDialog(null, "Hay un error, ingrese nuevamente los datos "); 
        }
        
    }
    
}
