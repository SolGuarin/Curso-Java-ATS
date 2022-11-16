/*sentencia if

    if(condicion){
        instruccion1
    }
    else{
        instruccion2
    }

    sentencia switch

    switch(dato){
        case 1: Instrucciones1;
                break;
        case 2 : Instrucciones2;
                break;
        ...
        case n : InstruccionesN;
                 break;
        default: CasoContrario;
                 break;
    }
 */
package condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        //Condicionales simples o dobles : if, else 
        int numero, dato = 5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        
        
        
        == : Igualdad
        != : Diferente
        > : Mayor
        >= : mayor o igual
        < : menor
        < : menor o igual
        
 
        if(numero > dato){
            JOptionPane.showMessageDialog(null, "el numero es mayor a 5");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero es menor a 5 o igual");
        }
        
        */
        
        //Condicionales múltiples - sentencia switch
        
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entre 1-5: "));
        
        switch(dato){
            case 1: JOptionPane.showMessageDialog(null, "Es el número 1");
                    break;
            case 2: JOptionPane.showMessageDialog(null, "Es el número 2");
                    break;
            case 3: JOptionPane.showMessageDialog(null, "Es el número 3");
                    break;
            case 4: JOptionPane.showMessageDialog(null, "Es el número 4");
                    break;
            case 5: JOptionPane.showMessageDialog(null, "Es el número 5");
                    break;
            default: JOptionPane.showMessageDialog(null, "El número no está en el rango de 1 - 5");                  
           
                    
        }
    }
    
}
