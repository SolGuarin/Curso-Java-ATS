/*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo que todos los meses son de 30 días.

 */
package ejercicio9_condicionales;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class Ejercicio9_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia, mes, año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        
        if(dia>=1 & dia<=30){
            if(mes>=1 & mes <=12){  
                if(año!=0){
                    JOptionPane.showMessageDialog(null, "La fecha es correcta");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Año incorrecto");
                }
            }else{
                JOptionPane.showMessageDialog(null, "mes incorrecto");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Día incorrecto");
        }
    }
}
