
package SobreescrituraMiembros;


public class Persona extends Animal {
    @Override //signifca que estoy sobreescribiendo el método 
    public void comer(){
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }
    
}
