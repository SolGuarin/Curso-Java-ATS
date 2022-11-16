
package Ejercicio5_POO;

import java.util.Scanner;

public class Main {
    
    //Método para hallar el área mayor 
    
    public static double mayorArea (Triangulo triangulos[]){
        double area;
        
        area = triangulos[0].obtenerArea();
        
        for(int i=1; i<triangulos.length; i++){
            if(triangulos[i].obtenerArea()>area){
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
        
    }
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        double base, lado;
        int nTriangulos;
        
        System.out.println("Digite el número de triángulos: ");
        nTriangulos = entrada.nextInt(); 
        
        //Se crean los objetos
        Triangulo triangulos[] = new Triangulo[nTriangulos];
        
        
        for(int i=0;i<triangulos.length; i++){
            System.out.println("Digite los valores del triángulo "+(i+1)+": ");
            System.out.print("Digite la base: ");
            base = entrada.nextDouble();
            System.out.print("Digite el lado: ");
            lado = entrada.nextDouble();
            
            triangulos[i] = new Triangulo(lado, base);
            
            //Mostrar el triánglu y perímetro de cada triangulo
            System.out.println("\nEl perímetro del triángulo es: "+triangulos[i].obtenerPerimetro());
            System.out.println("El área del triangulo es: "+triangulos[i].obtenerArea());
            
            System.out.println("");
        }
        
        System.out.println("\nEl área del triaángulo con mayor superficie es: "+mayorArea(triangulos));
    }
}
