
package Polimorfismo;

public class Main {
    
    public static void main(String [] args){
        
        //arreglo de vehículos
        Vehiculo misVehiculos [] = new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo("GHY", "Ferrari", "A89");
        
        //Polimormismo - un objeto de la clase padre puede instanciar objetos de las hijas
        misVehiculos[1] = new VehiculoTurismo(4, "78HJ", "Audi", "P14");
        misVehiculos[2] = new VehiculoDeportivo(500,"45GH", "Toyota", "Corolla");
        misVehiculos[3] = new VehiculoFurgoneta(2000, "JI8","Toyota","J9");
        
        for(Vehiculo vehiculos: misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
    }
}
