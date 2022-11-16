//Bucle fo each
package arreglos;

/**
 *
 * @author Usuario
 */
public class bucle_for_each {
    
    public static void main(String[] args) {
        /*
        //Para imprimir con un for
        String [] nombres = {"Alejandro","María","Luisa","Juan","Narcisa","Luis","Roberto","Flor","Jessica"};
        
        for(int i=0;i<9;i++){
            System.out.println(nombres[i]);
            
          
        //Para imprimir usando el método length
        String [] nombres = {"Alejandro","María","Luisa","Juan","Narcisa","Luis","Roberto","Flor","Jessica"};
        
        for(int i=0;i<nombres.length;i++){ 
            System.out.println(nombres[i]);
        */ 
         
        //Bucle for each
        
        String [] nombres = {"Alejandro","María","Luisa","Juan","Narcisa","Luis","Roberto","Flor","Jessica"};
        
        for(String i:nombres){
            System.out.println("Nombres: "+i);
        }
        
    }
    
}
