package Encapsulamiento;


public class Clase2 {
    public static void main(String [] args){
        
        Clase1 objeto1 = new Clase1();
        
        objeto1.setEdad(10);
        System.out.println("La edad es: "+objeto1.getEdad());
        
        objeto1.setNombre("Soleny Guarín"); // set, agrego el nombre
        System.out.println("El nombre es: "+objeto1.getNombre()); //get, obtengo el nombre
    }
}
