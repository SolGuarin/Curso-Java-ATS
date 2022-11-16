

/*Una empresa que se dedica a la venta de desinfectantes necesita un programa 
para gestionar las facturas. En cada factura figura: el código del artículo, 
la cantidad vendida en litros y el precio por litro. Se pide de 5 facturas 
introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y 
cuántas facturas se emitieron de más de 600$
package ejercicio17_ciclos;

/**
 *
 * @author Usuario
 */
package ejercicio17_ciclos;
import javax.swing.JOptionPane;
public class Ejercicio17_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int codigo, litros, litrosArticulo1=0, contadorMas600 = 0;
        float precioLitro, precioFactura, facturacionTotal = 0;
        
        for(int contador = 1; contador<=5; contador++ ){
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Artículo N°"+contador+"\nDigite el código: "));
        litros = Integer.parseInt(JOptionPane.showInputDialog("Artículo N°"+contador+"\nDigite la cantidad en litros: "));
        precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Artículo N°"+contador+"\nDigite el precio por litro: "));
        
        precioFactura = (float) litros * precioLitro; //Precio de cada factura
        facturacionTotal = facturacionTotal + precioFactura; //Suma iterartiva de todas las facturas
        
        if (codigo == 1){
            litrosArticulo1 += litros;
        }
        if(precioFactura>600){
            contadorMas600 ++;
            
        }
    }
        
        System.out.println("Resumen de ventas");
        System.out.println("Facturación total: "+facturacionTotal);
        System.out.println("La cantidad de litros vendidos del artículo 1  es: "+litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a $600: "+contadorMas600);
        
        
        
        
    }
    
}
