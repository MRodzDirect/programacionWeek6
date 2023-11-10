/*
Día de la Semana: Mostrar el nombre del día de la semana en función del número ingresado 
(1 para lunes, 2 para martes, etc.).
 */
package tareaprogsemana6;
/**
 * @author ELMO DE PLAZA SESAMO
 */
import java.util.Scanner;
public class diaSemana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Ingresa un numerito beibi");
        numero = teclado.nextInt();
        switch (numero){
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es Miercoles");
                break;
            case 4:
                System.out.println("Es jueves, de no te ahueves");
                break;
            case 5:
                System.out.println("Es viernes, y el cuerpo lo sabe");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;   
        }
    }   
}