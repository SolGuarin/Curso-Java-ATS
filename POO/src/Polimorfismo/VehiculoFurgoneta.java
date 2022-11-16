
package Polimorfismo;


public class VehiculoFurgoneta extends Vehiculo{
    private int carga;

    public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    
    //sobreescribimos el método mostrar datos
    @Override
    public String mostrarDatos(){
      return "Marca: "+marca+"\nMatricula: "+matricula+"\nModelo: "+modelo+
                "\nCarga: "+carga;  
    }  
}
