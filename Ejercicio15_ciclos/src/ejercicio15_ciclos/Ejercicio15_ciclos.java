/*Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
la cantidad de alumnos mayores de 18 años y la cantidad de alumnos que miden 
más de 1.75
 */
package ejercicio15_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio15_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        int edad;
        int contadorEdad = 0;
        int sumaEdad = 0;
        int promedioEdad;
        float estatura;
        int contadorEstatura = 0;
        float sumaEstatura = 0;
        float promedioEstatura;
        
        while( contador < 5){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
            estatura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su estatura: "));
            sumaEdad = sumaEdad + edad;
            sumaEstatura = sumaEstatura + estatura;
            contador += 1;
            
            if (edad > 18){
                contadorEdad += 1; //cuenta los mayores de 18
            }
            if (estatura > 1.75){
                contadorEstatura += 1; //cuenta los mayores de 1.75
            }   
        }
        promedioEdad = sumaEdad / 5;
        promedioEstatura = sumaEstatura / 5;
        JOptionPane.showMessageDialog(null, "La edad promedio es: "+promedioEdad);
        JOptionPane.showMessageDialog(null, "La estatura promedio es: "+promedioEstatura);
        JOptionPane.showMessageDialog(null, "Hay "+contadorEdad+" alumnos mayores de 18 años");
        JOptionPane.showMessageDialog(null, "Hay "+contadorEstatura+" alumnos que miden más de 1.75");
        
        
    }
    
}
