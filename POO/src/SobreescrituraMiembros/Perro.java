
package SobreescrituraMiembros;


public class Perro extends Animal {
    @Override //sobreescribiendo el método de la clase padre
    public void comer(){
        System.out.println("Estoy comiendo con mi platito en el suelo");
    }
    
}
