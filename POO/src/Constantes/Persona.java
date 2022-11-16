
//Constantes 

package Constantes;


public class Persona {
    
    private final String nombre;
    private int edad;
    
    //Método constructor 
    public Persona (String nombre, int edad) throws Exception{
        this.nombre = nombre;
        this.setEdad(edad);
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad) throws Exception{
        if(edad < 0){
            throw new Exception("Exception Edad negayiva no permitida");
        }else{
            this.edad = edad;
        }
    }
    
}
