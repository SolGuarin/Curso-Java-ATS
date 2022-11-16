/*Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dólares, con el siguiente menú de opciones:
1-Ingresar dinero a la cuenta 
2-Retirar dinero de la cuenta 
3-Salir
 */
package ejercicio13_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio13_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int saldoInicial = 1000;
        int opcion, saldo, saldoTotal;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("¡Bienvenido!\n"
                +"Elija una opción \n"
                +"1.Ingresar dinero a la cuenta\n"
                +"2.Retirar dinero de la cuenta\n"
                +"3.Salir"));
        
        if(opcion==1){
            saldo = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de dinero que desea ingresar"));
            saldoTotal = saldoInicial + saldo;
            JOptionPane.showMessageDialog(null, "Ingreso existoso\n"
            +"Su saldo es de: "+saldoTotal);
        }
        else if (opcion ==2){
            
            saldo = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de dinero que desea retirar"));
            if(saldo>saldoInicial){
                JOptionPane.showMessageDialog(null, "Error, no cuenta con el saldo sufiiente para este retiro");   
            }
            saldoTotal = saldoInicial - saldo;
            JOptionPane.showMessageDialog(null, "Retiro existoso\n"
            +"Su saldo es de: "+saldoTotal);   
        }
        
        else if (opcion==3){
            JOptionPane.showMessageDialog(null, "Gracias por usuar nuestros servicios");
        }
        else{
            JOptionPane.showMessageDialog(null, "Opción incorrecta"); 
        }
    }
    
}
