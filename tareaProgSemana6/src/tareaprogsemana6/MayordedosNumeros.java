/*
Mayor de dos números: Dados tres números, determinar cuál es el mayor. 
Si son iguales, mostrar un mensaje.
 */
package tareaprogsemana6;
/**
 * @author Mani de la era del hielo
 */
import java.util.Scanner;
public class MayordedosNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numerito1, numerito2;
        System.out.println("Hola bellaco");
        System.out.println("Ingresa el primer numero");
        numerito1 = teclado.nextInt();
        System.out.println("Ingresa el numero 2");
        numerito2 = teclado.nextInt();
        if (numerito1 > numerito2)
            System.out.println("El mayor es " + numerito1);
        else
            System.out.println("El mayor es " + numerito2);
    }
}