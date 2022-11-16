/*Dadas 6 notas, escribir la cantidad de alumnos aprobados,
condicionados (=4) y suspensos.
-condicionados = alumnos con nota de 4.
-aprobados = de 5 en adelante
-suspensos de 3 a 0

 */
package ejercicio19_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio19_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota;
        int contadorAprobados = 0, contadorCondicionados = 0, contadorSuspensos = 0;
        
        for(int contador = 1; contador <=6; contador++){
            nota = Float.parseFloat(JOptionPane.showInputDialog("Alumno N° "+contador+ " Ingrese su nota: "));
            
            if(nota<0 & nota>10){
                JOptionPane.showMessageDialog(null, "¡ERROR! Digite una nota entre 0 y 10");
            }
            if(nota>=5){
                contadorAprobados ++;
            }
            if(nota == 4){
                contadorCondicionados ++;
            }
            if(nota<4){
                contadorSuspensos ++;
            }
        }
        
        System.out.println("La cantidad de alumnos aprobados es: "+contadorAprobados);
        System.out.println("La cantidad de alumnos condicionados es: "+contadorCondicionados);
        System.out.println("La cantidad de alumnos suspensos es: "+contadorSuspensos);
    }
    
}
