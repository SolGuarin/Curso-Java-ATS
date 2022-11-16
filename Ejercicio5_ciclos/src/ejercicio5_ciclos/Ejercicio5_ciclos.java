/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_ciclos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio5_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int numero, numeroAleatorio, iterador = 1;
        
        System.out.println("Ingrese un número: ");
        numero = entrada.nextInt();
        
        numeroAleatorio = (int)(Math.random()*100);
        
        while(numero != numeroAleatorio){
            if(numero<numeroAleatorio){
                System.out.println("El número ingresado es menor ");
            }else{
                System.out.println("El número ingresado es mayor ");
            }
            System.out.println("Ingrese otro número: ");
            numero = entrada.nextInt();
            iterador = iterador +1;
        
        }
        
        System.out.println("Usted adivino al intento número "+iterador);
    
}
}
