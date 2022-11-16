/*Leer dos series de 10 enteros, que estarán ordenados crecientemente. 
Copiar las dos tablas en una tercera, de forma que sigan ordenados.
 */
package ejercicio14_arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio14_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int arreglo1[] = {1,3,5,7,9,11,13,15,17,19};
        int arreglo2[] = {2,4,6,8,10,12,14,16,18,20};
        int nuevoArreglo [] = new int [20];
        boolean crecienteArreglo1=true, crecienteArreglo2=true;
        /*
        System.out.println("ARREGLO 1");
        for(int i=0;i<10;i++){
            System.out.print("Digite el número "+i+": ");
            arreglo1[i] = entrada.nextInt();
        }
        for(int i=0; i<9; i++){
            if(arreglo1[i]<arreglo1[i+1]){
                crecienteArreglo1 = true;
            }
            if(arreglo1[i]>arreglo1[i+1]){
                crecienteArreglo1=false;
            }
        }
        System.out.println("ARREGLO 2");
        for(int i=0;i<10;i++){
            System.out.print("Digite el número "+i+": ");
            arreglo2[i] = entrada.nextInt();
        }
        for(int i=0; i<9; i++){
            if(arreglo2[i]<arreglo1[i+1]){
                crecienteArreglo2 = true;
            }
            if(arreglo1[i]>arreglo1[i+1]){
                crecienteArreglo2=false;
            }
        }
        
        int j=0;
        if(crecienteArreglo1 && crecienteArreglo2==true){
            for(int i=0;i<10;i++){
                if(arreglo1[i]<arreglo2[i]){
                  nuevoArreglo[j]=arreglo1[i];
                  j++;
                  nuevoArreglo[j]=arreglo2[i];
                  j++;
                }
            }

            
        }
        else{
            System.out.println("Los números no están ordenados en forma creiente. Ingreselos nuevamente");
        }
        System.out.println("\nEl nurvo arreglo es: ");
            System.out.println(arreglo1);
            
         
        int i=0, j=0, y=0;
        while(arreglo1[i]>arreglo2[j]){
            nuevoArreglo[y]=arreglo2[j];;
            j++;
            y++; 

        }
        */
       //pasando arreglo 1 a nuevo arreglo
        for(int i=0;i<10;i++){
            nuevoArreglo[i]=arreglo1[i];
            
            System.out.println(nuevoArreglo[i]);
        }
         int x = 9;     //contador externo 9-19 para trabajar en los espacios vacíos de array3
        for (int i = 0; i < 10; i++) {    
            if (arreglo2[i] >= nuevoArreglo[x]) {
                nuevoArreglo[x + 1] = arreglo2[i];
            }
            for (int j = x; j >= 0; j--) {
                if (arreglo2[i] < nuevoArreglo[j]) {
                    nuevoArreglo[j + 1] = nuevoArreglo[j];
                    nuevoArreglo[j] = arreglo2[i];
                } else {
                    break;
                }
            }
            x++;
 //aumentará un total de veces de la cantidad de valores del array2 (por el FOR)
        }
        System.out.println("\nVALORES DE TABLA 1 Y 2 ORDENADOS EN FORMA CRECIENTE");
        for (int i : nuevoArreglo) {
            System.out.print(i + " ");
        }
        

        }   
    
        
    }
   

