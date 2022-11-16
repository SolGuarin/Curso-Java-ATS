/*
Hacer un programa para calcular el área de polígonos (Triángulos y rectángulos) 
el programa debe ser capaz de almacenar en un arreglo N triángulos y 
N rectángulos, y al final mostrar el área y los datos de cada uno de ellos.

Para ello se tendrá lo siguiente:
-Una super clase llamada polígono 
-Una subclase llamada rectángulo
-Una subclase llamada triángulo

*/

package Ejercicio9_POO;

import java.util.ArrayList;
import java.util.Scanner;


public class Main { 
    //Arreglo dinámico
    static Scanner entrada = new Scanner (System.in);
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    
    public static void main(String [] args){
        //Llama función llenar polígono 
        llenarPoligono();
        
        //Llamo al método mostrar resultados
        mostrarResultados();
        
    }
    //Función para llenar los polígonos 
    public static void llenarPoligono(){
        int opcion;
        char respuesta;
        do{
            do{
                System.out.println("Qué polígono desea?: ");
                System.out.println("1. Triángulo");
                System.out.println("2. rectángulo");
                System.out.println("Digite una de las dos opciones");
                opcion = entrada.nextInt();      
            }while(opcion<1 || opcion>2);  
            
            switch(opcion){
                case 1: llenartriangulo(); //llamo al método llenar triángulo
                    break;
                case 2: llenarRectangulo(); //Llamo al método llenar un ractángulo
                    break;
            }
            System.out.println("Desea introducir otro polígono (s/n)");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        }while(respuesta =='s' || respuesta=='S');
    }
    
    //Función para llenar triángulos
    public static void llenartriangulo(){
        double lado1, lado2, lado3;
        System.out.print("\nDigite el lado 1 del triángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado 2 del triángulo: ");
        lado2 = entrada.nextDouble();
        System.out.print("Digite el lado 3 del triángulo: ");
        lado3 = entrada.nextDouble();
        
        //Creo el objeto triangulo
        Triangulo triangulo = new Triangulo (lado1, lado2, lado3);
        
        //Almaceno dentro del arreglo polígono al objeto triángulo
        poligono.add(triangulo);  
    }
    
     //Función para llenar rectángulos
    public static void llenarRectangulo(){
        double lado1,lado2;
        
        System.out.print("\nDigite el lado 1 del rectángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado 2 del rectángulo: ");
        lado2 = entrada.nextDouble();
        
        //Creo el objeto rectángulo
        Rectangulo rectangulo = new Rectangulo (lado1, lado2);
        //Almaceno dentro del arreglo polígono al objeto rectángulo
        poligono.add(rectangulo);
    }
    
    //Función para mostrar todos los polígonos
    public static void mostrarResultados(){
        
        //recorro el arreglo de polígonos
        for(Poligono poli: poligono){
            System.out.println(poli.toString());
            System.out.println("El área es: "+poli.area());
            System.out.println("");
        }
    }
    
    
    
}
