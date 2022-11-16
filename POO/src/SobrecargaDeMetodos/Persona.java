/*
 sobrecarga de métodos
 */
package SobrecargaDeMetodos;

public class Persona {
    
    //Atributos
    String nombre;
    int edad;
    String identidad;
    //Métodos

    //sobrecarga de método constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String identidad) {
        this.identidad = identidad;
    }
    
    //Sobrecarga de métodos normales
    public void correr(){
        System.out.println("Soy "+nombre+" tengo "+edad+" años y estoy corriendo una maratón");
    }
    
    public void correr(int km){
        System.out.println("He corrido "+km+" kilómetros");
    }
    
    
    

            
    
    
}
