/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class LLenar_un_arreglo {
    
    public static void main(String[] args) {
    //Para pedir los datos al usuario
    
    Scanner entrada = new Scanner(System.in);
    
    int nElementos; //variable donde voy a almacenar el número de elemento que tendrá mi arreglo
    
    nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elemntos del arreglo")); //Para pedirle el número de elemntos al usuario
    
    char[] letras = new char [nElementos]; //Arreglo
    
        System.out.println(" Digite los elementos del arreglo");
        for(int i=0; i<nElementos; i++){
            System.out.println((i+1)+".Digite un caracter: ");
            letras[i] = entrada.next().charAt(0); //Para guardar los caracteres que el usuario ingrese
        }
        
        
        System.out.println("\nLos caracteres del arreglo son: ");
        for(int i=0;i<nElementos; i++){
            System.out.println(letras[i]);
            
        }
}
}
