
package Ejercicio4_POO;

import java.util.Scanner;

public class MainEjercicio4 {
    
    //Método para hallar el atleta ganador
    public static int atletaGanador(Atleta runner[]){
        float tiempoCarrera;
        int indice = 0;
        
        tiempoCarrera = runner[0].getTiempoCarrera(); 
        for(int i=1; i<runner.length; i++){
            if(runner[i].getTiempoCarrera()<tiempoCarrera){
                tiempoCarrera = runner[i].getTiempoCarrera();
                indice = i;
            }
        } 
        return indice;
        
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String numeroAtleta;
        String nombre;
        float tiempoCarrera;
        int cantidadAtletas, indiceAtleta;
        
        System.out.print("¿Cuántos atletas desea registrar?: ");
        cantidadAtletas = entrada.nextInt();
        
        //Objetos para los atletas
        Atleta runner[] = new Atleta[cantidadAtletas];
        
        System.out.println("Llene los datos de los atletas: ");
        for(int i=0; i<runner.length; i++){
            entrada.nextLine();
            
            System.out.println("Digite los datos del atleta "+(i+1));
            System.out.print("Número del atleta:");
            numeroAtleta = entrada.nextLine();
            
            System.out.print("Nombre: ");
            nombre = entrada.nextLine();
            
            System.out.print("Tiempo de carrera: ");
            tiempoCarrera = entrada.nextFloat();
            
            runner[i] = new Atleta(numeroAtleta, nombre, tiempoCarrera);
        }
        
        //Lamo al método que busca el atleta ganador y lo almaceno en esta variable
        indiceAtleta = atletaGanador(runner);
        
        System.out.println("\nEl atleta ganador es: ");
        System.out.println(runner[indiceAtleta].mostrarDatos());
    }
    
    
   
} 
