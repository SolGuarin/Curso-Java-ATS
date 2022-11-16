/*Pedir 5 calificaciones y decir al final si hay algún suspenso.
-suspenso de 3 a 0

 */
package ejercicio22_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio22_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float calificacion;
        boolean suspensos = false;
        int contadorSuspensos = 0;
        
        for(int contador = 1; contador <= 5; contador ++){
            calificacion = Float.parseFloat(JOptionPane.showInputDialog("Alumno N° "+contador+" Ingrese su nota:"));
            
            if(calificacion <= 3){
                suspensos = true;
                contadorSuspensos ++;
            }
        }
        
        if(suspensos == true){
            System.out.println("Si hay alumnos suspensos");
            System.out.println("Hay "+contadorSuspensos+" alumnos suspensos");    
        }
        else{
            System.out.println("No hay alumnos suspensos");
        }  
    }  
}
