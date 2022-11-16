
//Declaración de las excepciones de un método
package pruebaexcepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PruebaExcepciones {
  
 
    
    /*
    //Declaración de las excepciones de un método
     public void leerArchivo() throws FileNotFoundException{
            
            File archivo = new File("D:\\JJ\\texto.txt");
            FileReader fr = new FileReader(archivo);
            
        }
     public void leerArchivo2() throws IOException{
         leerArchivo();
     }
     */
     //try catch para expresiones verificadas
    public void leerArchivo() throws FileNotFoundException, IOException{
        File archivo = new File("D:\\prueba\\texto.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf  = new BufferedReader(fr);
        String linea;
        
        while((linea = bf.readLine()) !=null){
            System.out.println(linea);
        }
            
        }
     public void leerArchivo2(){ 
         try{
            leerArchivo(); 
         } catch(FileNotFoundException ex){
             JOptionPane.showMessageDialog(null, "No se ha encontrado el archico deseado, por favor verifique la ruta");
         }catch(IOException e){
             JOptionPane.showMessageDialog(null, "Ha ocurrido una excepción verificada");
         }  
         System.out.println("Programa terminado");
     }
        public static void main(String[] args) {  
        
        PruebaExcepciones prueba = new PruebaExcepciones();
        
        prueba.leerArchivo2();
    } 
    
}
