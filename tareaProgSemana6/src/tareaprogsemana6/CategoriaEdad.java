//Categoría de Edad: Clasificar a una persona en una categoría de edad 
//(niño, adolescente, adulto) en función de su edad.
package tareaprogsemana6;

import java.util.Scanner;

/**
 *
 * @author Buzz light year
 */
public class CategoriaEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();
        
        if(edad >= 18){
            System.out.println("Eres un adulto");
        }else if(edad >= 12){
            System.out.println("Eres un adolescente");
        }else{
            System.out.println("Eres un nino");
        }
    }
}
