
package Ejercicio3_POO;

import java.util.Scanner;

public class Main {
    
    //Método para hallar el vehiculo más barato
    public static int indiceBarato (Vehiculo coche[]){
        float precio;
        int indice = 0;
        
        precio = coche[0].getPrecio();
        
        for(int i=1; i<coche.length; i++){
            if(coche[i].getPrecio()<precio){
                precio = coche[i].getPrecio();
                indice = i;
            }
        }
        return indice; 
    }
            
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos;
        int indiceCoche;
        
        
        System.out.print("¿cuántos vehículos?");
        numeroVehiculos = entrada.nextInt();
        
        //Objetos para los coches
        Vehiculo coche[] = new Vehiculo[numeroVehiculos];
        
        //Datos de todos los coches  
        for(int i=0; i<numeroVehiculos; i++){
            entrada.nextLine();
            System.out.println("Digite los datos del coche "+(i+1));
            System.out.print("Digite la marca: ");
            marca = entrada.nextLine();
            
            System.out.print("Digite el modelo: ");
            modelo = entrada.nextLine();
            
            System.out.print("Digite el precio: ");
            precio = entrada.nextFloat();
            
            coche[i] = new Vehiculo(marca, modelo, precio);   
        }
        
        indiceCoche = indiceBarato(coche);
        System.out.println("\n El coche más barato es: ");
        System.out.println(coche[indiceCoche].mostrarDatos());  
    }
}
