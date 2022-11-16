/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String vendedor;
        int salarioBase = 1000, comision1, comision2, valorVenta, carrosVendidos, salarioMensual;
        
        System.out.println("Ingrese su nombre:");
        vendedor = entrada.nextLine();
        
        System.out.println("¿Cuántos carros vendió este mes?");
        carrosVendidos = entrada.nextInt();
        
        System.out.println("valor de la venta: ");
        valorVenta = entrada.nextInt();
        
        comision1 = carrosVendidos * 150;
        comision2 = (valorVenta*5) / 100;
        
        salarioMensual = salarioBase + comision1 + comision2;
        
        System.out.println(vendedor+" su salario de este mes es: "+salarioMensual);
;
        
    }
    
}
