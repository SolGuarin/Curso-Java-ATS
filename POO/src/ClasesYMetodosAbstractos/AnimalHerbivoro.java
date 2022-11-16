
package ClasesYMetodosAbstractos;


public class AnimalHerbivoro extends Animal {
    
    @Override
    public void alimentarse(){
        System.out.println("El animal herbívoro se alimenta de hierbas");
        //Implemento el método porque no es abstracta
    }  
}
