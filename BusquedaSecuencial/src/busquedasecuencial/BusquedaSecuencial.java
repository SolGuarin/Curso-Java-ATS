/*

Búsqueda secuencial

arreglo [] = {3,1,2,5,4}; dato = 2;

 */
package busquedasecuencial;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class BusquedaSecuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo [] = {4,1,5,2,3};
        int dato; //valor que voy a buscar en el arreglo
        boolean bandera = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Qué número desea buscar: "));
        
        //Búsqueda secuencial
        
        int i=0;
        
        while(i<5 && bandera == false){
            if(arreglo[i] == dato){
                bandera = true;   
            }
            i++; 
        }
        
        if(bandera == false){
            JOptionPane.showMessageDialog(null, "Número no encontrado");
        }
        else{
           JOptionPane.showMessageDialog(null, "Número encontrado es la posición "+(i-1)); 
        }
        
    }
    
}
