/*
Diseñar un programa para trabajar con triángulos isósceles. Para ello defina los
atributos necesarios que se requieren, proporcione métodos de consulta, un método
constructor e implemente métodos para calcular el perímetro y el área de un
triangulo, además implementar un método que apartir de un arreglo de triángulos 
devuelva el área del triángulo de mayor superficie.
 */
package Ejercicio5_POO;

public class Triangulo {
    private double lado;
    private double base;
    
    //Método constructor
    public Triangulo(double lado, double base) {
        this.lado = lado;
        this.base = base;
    } 
    //Método para el perímetro
    public double obtenerPerimetro (){
        double perimetro = lado*2 + base;
        return perimetro;
    }
    
    //Método para el área
    public double obtenerArea(){
        double area = (base*Math.sqrt((lado*lado)-(base*base)/4))/2;
        return area;           
    }   
}
