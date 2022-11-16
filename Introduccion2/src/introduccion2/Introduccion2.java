/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion2;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Introduccion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite su nombre: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero : "));
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0); 
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal :"));
        
        JOptionPane.showMessageDialog(null, "Su nombre es: "+cadena);
        JOptionPane.showMessageDialog(null, "El númeo entero es: "+entero);
        JOptionPane.showMessageDialog(null, "El caracter es: "+letra);
        JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);
                
    }  
}
