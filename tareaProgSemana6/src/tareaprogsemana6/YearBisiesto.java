//Año Bisiesto: Comprobar si un año ingresado es bisiesto o no.
//Si es bisiesto, mostrar un mensaje especial.
package tareaprogsemana6;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class YearBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el anio");
        int year = sc.nextInt();
        
       //Calcular usando la formula
       if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
           System.out.println("El anio es bisiesto");
       }else{
           System.out.println("El anio no es bisiesto");
       }
    }
}
