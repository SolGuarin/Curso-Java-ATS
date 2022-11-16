
package ClasesYMetodosAbstractos;


public class AnimalCarnivoro extends Animal{
    
    @Override
    public void alimentarse(){
        System.out.println("El animal carnívoro se alimenta de carne");
        //Implemento el método porque no es abstracta
    }   
}
