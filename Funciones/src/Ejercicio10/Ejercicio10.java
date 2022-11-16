/*
Crear una función que nos devuelva un array de un número a otro, ambos incluidos.
Por ejemplo, si introduzco de 5 a 7, el array tendrá los números 5,6 y 7, pero si 
inserto de 7 a 5 el array tendrá los números 7,6,5;
 */
package Ejercicio10;
public class Ejercicio10 {
    public static void main(String [] args){
        int []arreglo1 = array (5,7);
        int []arreglo2 = array (7,5);
        
        mostrar(arreglo1);
        System.out.println("");
        mostrar(arreglo2); 
    }
    public static int[] array(int num1, int num2){
        int tamaño = Math.abs(num1 - num2)+1;
        int arreglo[]= new int[tamaño];
        
        if(num1<num2){
            for(int i=0, j=num1; i<arreglo.length; i++, j++){
                arreglo[i]=j;
            }
        }
        else{
            for(int i=0, j=num1;i<arreglo.length; i++,j--){
                arreglo[i]=j;
            }
        }
        return arreglo;
    }
    
    public static void mostrar(int[] array){
        System.out.println("El arreglo es: ");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }   
}
