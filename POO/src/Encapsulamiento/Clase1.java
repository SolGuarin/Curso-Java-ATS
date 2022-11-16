//En capsulamiento y métodos accesores
package Encapsulamiento;


public class Clase1 {
    
    private int edad;
    private String nombre;
    
    //Método setter: Establecemos la edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    //Método getter: Mostramos la edad
    public int getEdad(){
        return edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
}
