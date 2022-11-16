/*
Construir un programa que permita dirigir el movimiento de un objeto dentro de 
un tablero y actualice su posición dentro del mismo. Los movimientos posibles 
son, ARRIBA, ABAJO, DERECHA, IZQUIERDA. Tras cada movimiento el programa 
mostrará la nueva dirección elegida y las coordenadas de situación del objeto 
dentro del tablero.
 */
package Ejercicio2_POO;


public class Clase1 {
    private int x;
    private int y;
    

    public Clase1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    public void moverseArriba(){
        this.y = this.y+1;
        
        System.out.println("La nueva posición es: "+this.x+","+this.y);
    }
    
    public void moverseAbajo(){
        this.y = this.y-1;
        System.out.println("POSICION: ("+this.x+","+this.y+")");
    }
    
    public void moverseDerecha(){
        this.x = this.x+1;
        System.out.println("La nueva posición es: ("+this.x+","+this.y+")");
    }
    
    
    public void moverseIzquierda (){
        this.x = this.x-1;
        System.out.println("La nueva posición es: "+this.x+","+this.y);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    
    
}
