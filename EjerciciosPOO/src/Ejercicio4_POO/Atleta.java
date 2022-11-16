/*
Construir un programa para una competencia de atletismo, el programa debe 
gestionar una serie de atletas, caracterizados por su número de atleta, 
nombre y tiempo de carrera final, al final el programa debe mostrar los datos 
del atleta ganador de la carrera.
 */
package Ejercicio4_POO;

public class Atleta {  
    private String numeroAtleta;
    private String nombre;
    private float tiempoCarrera;

    //Método constructor
    public Atleta(String numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }
    
    //Método para obtener el tiempo
    public float getTiempoCarrera() {
        return tiempoCarrera;
    }
    
    //Método para mostrar datos
    public String mostrarDatos(){
        return "Número atleta: "+numeroAtleta+"\nNombre: "+nombre+"\nTiempo de carrera: "+tiempoCarrera+"\n";
    }
    
    
    
}
