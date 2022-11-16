/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_condicionale;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio4_condicionale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int precio, descuento, total;
        
        precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio de su compra"));
        
        if(precio >= 30000){
            descuento = (precio*20)/100;
            total = precio - descuento;
            JOptionPane.showMessageDialog(null, "El total de su compra es: "+total);
        }
        else{
            JOptionPane.showMessageDialog(null, "Su compra no tiene descuento. El total es: "+precio);
        }
    }
    
}
