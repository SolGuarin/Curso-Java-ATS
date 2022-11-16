/* 

ciclo while


ciclo do while

do{
    Instruciones;
}while(condicion);


ciclo for

for(inicialización ; condicion ; aumento o decremento){
    Intrucciones;
}
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        
        // Ciclo while 
        //Numeros del 1 al 10 - ascendente
        int iterador = 1;
        ;
        
        while(iterador<=10){
            System.out.println(iterador);
            iterador = iterador + 1;
        
        
        
        //Numeros del 1 al 10 - descendente
        int iterador = 10;
        
        
        while(iterador>=0){
            System.out.println(iterador);
            iterador = iterador - 1;

        
        
        //pidiendo la cantidad de números al usuario
        Scanner entrada = new Scanner (System.in);
        int iterador = 1, contador;
        
        System.out.println("Cuánto números quiere en pantalla");
        contador = entrada.nextInt();
        
        while(iterador <= contador ){
            System.out.println(iterador);
            iterador =  iterador + 1;
            
        
            
        //Ciclo do while 
        
        Scanner entrada = new Scanner (System.in);
        int iterador = 1, contador;
        
        System.out.println("Cuántos número desea imrpimir en pantalla: ");
        contador = entrada.nextInt();
        
        
        do{
            System.out.println(iterador);
            iterador++;   
        }while(iterador <= contador);
        
        */
        
        //Ciclo for
        
        Scanner entrada = new Scanner (System.in);
        int contador;
        
        System.out.println("Cuánto números quiere en pantalla");
        contador = entrada.nextInt();
        
        for(int iterador=2; iterador <=contador ; iterador = iterador + 2){
            System.out.println(iterador);
        }
        

        
        
    }
    
}