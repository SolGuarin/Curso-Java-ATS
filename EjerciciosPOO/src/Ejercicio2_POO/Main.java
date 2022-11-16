/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2_POO;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String [] args){
        
        Clase1 objeto1 = new Clase1(0,0);
        int movimiento=3;
        
        System.out.println("Posición inicial del objeto: "+objeto1.getX()+","+objeto1.getY());
        
        //movimiento = (JOptionPane.showInputDialog("Hacia donde desea mover el objeto: "+ "\n1: Arriba"+"\n 2: Abajo"+"\n 3: Derecha"+"\n 4: izquierda"));
        /*
        switch(movimiento){
            case 1:
                objeto1.moverseArriba();
            case 2: 
                objeto1.moverseAbajo();
            case 3: 
                objeto1.moverseDerecha();
            case 4:
                objeto1.moverseIzquierda();
                
        }
*/
        objeto1.moverseDerecha();
        objeto1.moverseDerecha();
        objeto1.moverseDerecha();
        objeto1.moverseAbajo();
    }
    
}
