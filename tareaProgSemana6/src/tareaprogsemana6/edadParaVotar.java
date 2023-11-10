/*
Edad para Votar: Determinar si una persona es elegible para votar 
en función de su edad (mayor o igual a 18 años).
 */
package tareaprogsemana6;
/**
 * @author ROCKY BALBOA
 */
import java.util.Scanner;
public class edadParaVotar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad canto de bellaco");
        edad = teclado.nextInt();
        if (edad < 18)
            System.out.println("No eres apto para votar");
        else
            System.out.println("Eres apto para votar");
    }  
}