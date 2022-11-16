/*Hacer un programa que pase de kilogramos a otra unidad de medida de masa, 
mostrar en pantalla un menú con las opciones disponibles 
 */
package ejercicio14_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio14_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        float kilogramo, libra, gramo, miligramo;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("¡Bienvenido!\n"
        +"¿Qué conversion desea realizar?\n"
        +"1.Kilogramo a libra\n"
        +"2.Kilogramo a gramo\n"
        +"3.Kilogramo a miligramo"));
        
        switch(opcion){
            case 1 : kilogramo = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de kilogramos que desea convertir: "));
                     libra = (kilogramo * 2.2046f) / 1;
                     JOptionPane.showMessageDialog(null, kilogramo+" kilogramos son "+libra+ " libras");
                     break;
            case 2 : kilogramo = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de kilogramos que desea convertir: "));
                     gramo = (kilogramo * 1000)/1;
                     JOptionPane.showMessageDialog(null, kilogramo+" kilogramos son "+gramo+ " gramos");
                     break;
            case 3 : kilogramo = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de kilogramos que desea convertir: "));
                     miligramo = (kilogramo * 1000000)/1;
                     JOptionPane.showMessageDialog(null, kilogramo+" kilogramos son "+miligramo+ " miligramos");
                     break;
            default : JOptionPane.showMessageDialog(null,"Error, digite un opción válida");
                     break;
        }
    }
    
}
