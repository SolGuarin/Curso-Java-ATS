
package Ejercicio9_POO;


public abstract class Poligono {
    protected int numeroLados;

    //Constructor
    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    //Getter
    public int getNumeroLados() {
        return numeroLados;
    }
    
    @Override
    public String toString(){
        return "El número de lado es: "+numeroLados;
    }
    
    //Declaro método área como abstracto
    public abstract double area();

}