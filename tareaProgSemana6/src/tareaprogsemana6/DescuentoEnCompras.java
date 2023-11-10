//Descuento en Compras: Calcular el precio final de un producto con un descuento
//del 10% si el precio original es mayor de $100; de lo contrario, 
//no hay descuento.
package tareaprogsemana6;

import java.util.Scanner;

/**
 *
 * @author Chewbacca 2.0
 */
public class DescuentoEnCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto");
        int precio = sc.nextInt();
        
        if(precio > 100){
            precio -= precio * 0.10;
        }
        
        System.out.println("El precio final del producto es: " + precio); 
    }
}
