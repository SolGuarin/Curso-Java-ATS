
package Ejercicio6_POO;

import static Ejercicio6_POO.NumeroComplejo.sumar;


public class Main {
    public static void main(String [] args){
     
    NumeroComplejo nComplejo1 = new NumeroComplejo(4, 5);
    NumeroComplejo nComplejo2 = new NumeroComplejo(10, 5);
    NumeroComplejo nComplejo = new NumeroComplejo(2, 3);
    int numInt = 4;
    
    //Llamar suma
    NumeroComplejo.sumar(nComplejo1, nComplejo2);   
    //Multiplicar dos complejos
    NumeroComplejo.multiplicar(nComplejo1, nComplejo2);
    //Multiplicar complejo x entero
    NumeroComplejo.multiplicarInt(nComplejo, numInt);
    } 
}

