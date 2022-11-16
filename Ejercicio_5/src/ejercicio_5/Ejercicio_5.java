/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float participacion, primerExamen, segundoExamen, examenFinal, notaFinal;
        
        System.out.println("Nota de participación: ");
        participacion = entrada.nextFloat();
        
        System.out.println("Nota del primer examen: ");
        primerExamen = entrada.nextFloat();
        
        System.out.println("Nota del segundo examen: ");
        segundoExamen = entrada.nextFloat();
        
        System.out.println("Nota del examen final: ");
        examenFinal = entrada.nextFloat();
        
        participacion = (participacion*10)/100;
        primerExamen = (primerExamen*25)/100;
        segundoExamen = (segundoExamen*25)/100;
        examenFinal = (examenFinal*40)/100;
        
        notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
        
        System.out.println("Su nota final es:"+notaFinal);
        
       
    }
    
}
