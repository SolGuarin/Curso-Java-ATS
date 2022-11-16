
package Polimorfismo;

public class VehiculoDeportivo extends Vehiculo {
    
    private int cilindrada;

    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    
    //sobreescribimos el método mostrar datos
    @Override
    public String mostrarDatos(){
        return "Marca: "+marca+"\nMatricula: "+matricula+"\nModelo: "+modelo+
                "\nCilindrada: "+cilindrada;
    }   
}
