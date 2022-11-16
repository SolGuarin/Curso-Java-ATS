/*Pedir 10 números y mostrar al final si se ha introducido alguno negativo
 */
package ejercicio21_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio21_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, contador = 1, contadorNegativos = 0;
        boolean numerosNegativos = false;
        
        while(contador <= 10){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el "+contador+" número:"));
            contador ++;
            
            if(numero<0){
                numerosNegativos = true;
                contadorNegativos ++;
            }
        }
        if(numerosNegativos == true){
            System.out.println("Usted si ha ingresado números negativos");
            System.out.println("Usted ingreso "+contadorNegativos+" números negativos");
        }
        else{
            System.out.println("Usted no ha ingresado números negativos");
        }
        
    }
    
}
