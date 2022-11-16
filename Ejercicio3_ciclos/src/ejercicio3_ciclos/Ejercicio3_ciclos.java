/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio3_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(numero>0){
            if(numero%2==0){
                JOptionPane.showMessageDialog(null, "El "+numero+" es par");
            }else{
                JOptionPane.showMessageDialog(null, "El "+numero+" es impar");
            }
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        }
    }
    
}
