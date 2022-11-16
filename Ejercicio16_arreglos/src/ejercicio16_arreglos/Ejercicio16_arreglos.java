/*Queremos desarrollar una aplicación que nos ayude a gestionar las notas de 
un centro educativo. Cada grupo o clase está compuesto por 5 alumnos. 
Se pide leer las notas del primer, segundo y tercer trimestre de un grupo.
Debemos mostrar al final la nota media del grupo en cada trimestre y la media 
del alumno que se encuentre en N posición (N se lee por teclado)

 */
package ejercicio16_arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio16_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        float notas1 [] = new float [5];
        float notas2 [] = new float [5];
        float notas3 [] = new float [5];
        float notasAlumno [] = new float [3];
        float suma1=0, suma2=0, suma3=0, sumaAlumno=0;
        float promedio1, promedio2, promedio3, promedioAlumno;
        int alumnoN;
        
        //Notas primer trimestre
        System.out.println("NOTAS PRIMER TRIMESTRE");
        for(int i=0; i<5; i++){
            System.out.print("Ingrese la nota "+(i+1)+": ");
            notas1[i] = entrada.nextFloat();
        }
        //Notas segundo trimestre
        System.out.println("NOTAS SEGUNDO TRIMESTRE");
        for(int i=0; i<5; i++){
            System.out.print("Ingrese la nota "+(i+1)+": ");
            notas2[i] = entrada.nextFloat();
        }
        //Notas tercer trimestre
        System.out.println("NOTAS TERCER TRIMESTRE");
        for(int i=0; i<5; i++){
            System.out.print("Ingrese la nota "+(i+1)+": ");
            notas3[i] = entrada.nextFloat();
        }
        
        //Promedio por trimestres
        for(int i=0; i<5; i++){
            suma1 = suma1 +notas1[i]; 
            suma2 = suma2 + notas2[i];
            suma3 = suma3 + notas3[i];
        }

        promedio1 = suma1/notas1.length;
        promedio2 = suma2/notas2.length;
        promedio3 = suma3/notas3.length;
        
        System.out.println("El promedio del primer trimestre es: "+promedio1);
        System.out.println("El promedio del segundo trimestre es: "+promedio2);
        System.out.println("El promedio del tercer trimestre es: "+promedio3);
        
        //Promedio alumno N 
        System.out.println("De que estudiante desea consultar el promedio?: ");
        alumnoN = entrada.nextInt();
        
        sumaAlumno = (notas1[alumnoN]+notas2[alumnoN])+notas3[alumnoN];
            
        promedioAlumno = sumaAlumno/3;
        System.out.println("El promedio del alumno es: "+promedioAlumno);
        
    } 
}
