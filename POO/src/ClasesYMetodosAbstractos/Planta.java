
package ClasesYMetodosAbstractos;

public class Planta extends SerVivo {
    
    @Override
    public void alimentarse(){
        System.out.println("La planta se alimenta a través de la fotosíntesis");
        //Si implemento el método porque no es abstracta
    }
}
