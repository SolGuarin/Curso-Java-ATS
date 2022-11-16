
package Polimorfismo;


public class VehiculoTurismo extends Vehiculo{
    private int nPuertas;

    public VehiculoTurismo(int nPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }
    //sobreescribimos el método mostrar datos
    @Override
    public String mostrarDatos(){
        return "Marca: "+marca+"\nMatricula: "+matricula+"\nModelo: "+modelo+
                "\nNúmero de puertas: "+nPuertas;
    }
}
