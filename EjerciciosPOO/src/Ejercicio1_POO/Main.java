
package Ejercicio1_POO;

import javax.swing.JOptionPane;

public class Main {
    public static void main (String [] args){
        
        Cuadrilatero objeto1;
        float lado1, lado2;
        
        //Pedir datos al usuario 
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado uno del cuadrilátero: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado dos del cuadrilátero: "));
        
        //Inicializar el objeto
        if(lado1 == 2){
            objeto1 = new Cuadrilatero(lado1);
        }
        else{
            objeto1 = new Cuadrilatero(lado1, lado2);
        }
        
        System.out.println("El perímetro es: "+objeto1.getPerimetro());
        System.out.println("El área es: "+objeto1.getArea());
    } 
}
