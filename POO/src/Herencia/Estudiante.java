
package Herencia;

public class Estudiante extends Persona {
    private int codigoEstudiante;
    private float notaFinal;
    
    //Constructor de la clase hija
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
        super(nombre, apellido, edad); //indica que estos ya estas inicializados en la clase persona 
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    //Los get de nombre, apellido y edad ya los hereda de la clase padre(Persona)
       
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nEdad: "+getEdad()+
                "\nCódigo estudiante: "+codigoEstudiante+
                "\nNota final: "+notaFinal);
    }           
}
