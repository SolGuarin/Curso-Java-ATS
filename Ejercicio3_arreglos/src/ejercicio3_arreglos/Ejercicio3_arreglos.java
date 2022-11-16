/*Leer 5 números por teclado, almacenarlos en un arreglo y a continuación 
realizar la media de los números positivos, la media de los negativos y 
contar el número de ceros
 */
package ejercicio3_arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        float numeros [] = new float [5];
        float sumaPositivos=0, sumaNegativos=0, promedioPositivos, promedioNegativos;
        int conteoCeros=0, conteoPositivos=0, conteoNegativos=0;
        
        /*
        System.out.println("usted debe ingresar 5 números");
        for(int i=0; i<5; i++){
            System.out.println("Ingrese el numero: "+(i+1)+" :");
            numeros[i] = entrada.nextFloat();
            
            if(numeros[i]==0){
                conteoCeros ++;
            }
            else if(numeros[i]>=0){
                sumaPositivos= numeros[i] + sumaPositivos;
                conteoPositivos ++;
            }
            else{
                sumaNegativos=numeros[i]+sumaNegativos;
                conteoNegativos ++;  
            }   
        }
        */
        System.out.println("usted debe ingresar 5 números");
        for(float i:numeros){
            System.out.println("Ingrese un numero:");
            i = entrada.nextFloat();
            
            if(i==0){
                conteoCeros ++;
            }
            else if(i>=0){
                sumaPositivos= i + sumaPositivos;
                conteoPositivos ++;
            }
            else{
                sumaNegativos=i+sumaNegativos;
                conteoNegativos ++;  
            }  
        }
        promedioPositivos = sumaPositivos / conteoPositivos;
        promedioNegativos = sumaNegativos /conteoNegativos;
        
        System.out.println("La cantidad de ceros es: "+conteoCeros);
        System.out.println("El promedio de los números positivos es: "+promedioPositivos);
        System.out.println("El promedio de los números negativos es: "+promedioNegativos);
        
        
    }
    
}
