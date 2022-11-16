
package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String [] args){
        
        //Objeto de la clase operación
        /*
        Operacion op = new Operacion();
        
        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultado();
        
       
        //Pedir números para ejemplo de parámetros y argumentos
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        MetodosParametrosYArgumentos operacion = new MetodosParametrosYArgumentos();
        
        operacion.sumar(n1, n2);
        operacion.restar(n1, n2);
        operacion.multiplicar(n1, n2);
        operacion.dividir(n1, n2);
        operacion.mostrarResultado();
        */
        
        //Ejemplo de retorno de valores
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        MetodosRetornoDeValores operacion = new MetodosRetornoDeValores();
        
        int suma = operacion.sumar(n1, n2);
        int resta = operacion.restar(n1, n2);
        int multiplicacion = operacion.multiplicar(n1, n2);
        int division = operacion.dividir(n1, n2);
        
        
        System.out.println("La suma es: "+operacion.sumar(n1, n2));
        System.out.println("La resta es: "+operacion.restar(n1, n2));
        System.out.println("La multiplicación es: "+operacion.multiplicar(n1, n2));
        System.out.println("La división es: "+operacion.dividir(n1, n2));
        
    }
}
