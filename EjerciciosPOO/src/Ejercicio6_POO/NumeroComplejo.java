
package Ejercicio6_POO;


public class NumeroComplejo {
    
    public int real;
    public int imaginario;

    public NumeroComplejo(int real,int imaginario) {
        this.imaginario = imaginario;
        this.real = real;
    }
    
    //Sumar
    public static NumeroComplejo sumar( NumeroComplejo nComplejo1, NumeroComplejo nComplejo2){
        
    NumeroComplejo resultado = new NumeroComplejo(0, 0);
        
    resultado.real = nComplejo1.real + nComplejo2.real;
    resultado.imaginario = nComplejo1.imaginario +nComplejo2.imaginario;
        System.out.println("La sumas es:\n"+resultado.real+"i +"+resultado.imaginario);
    return resultado;   
    }
    
    //Multiplicar dos números complejos
    public static NumeroComplejo multiplicar(NumeroComplejo nComplejo1, NumeroComplejo nComplejo2){
        NumeroComplejo resultadoMult = new NumeroComplejo(0, 0);
        resultadoMult.real = nComplejo1.real * nComplejo2.real;
        resultadoMult.imaginario = nComplejo1.imaginario * nComplejo2.imaginario;
        System.out.println("La multiplicación es:\n"+resultadoMult.real+"i x "+resultadoMult.imaginario);
        return resultadoMult;
    }
    
    //Multiplicar número complejo x un enteros
    public static NumeroComplejo multiplicarInt(NumeroComplejo nComplejo, int numInt){
        
        NumeroComplejo resMultiplicarInt = new NumeroComplejo(0, 0);
        resMultiplicarInt.real = nComplejo.real * numInt;
        resMultiplicarInt.imaginario = nComplejo.imaginario * numInt;
        System.out.println("Multiplicación número complejo x entero:\n"+resMultiplicarInt.real+"i x "+resMultiplicarInt.imaginario);
        return resMultiplicarInt;    
    }
    
    }




