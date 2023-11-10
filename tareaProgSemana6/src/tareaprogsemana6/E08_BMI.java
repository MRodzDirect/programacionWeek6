//Calculadora de IMC: Calcular el índice de masa corporal (IMC) de una persona
//y clasificarla en función de su valor 
//(bajo peso, peso normal, sobrepeso, etc.).
package tareaprogsemana6;

import java.util.Scanner;

/**
 *
 * @author Toretto
 */
public class E08_BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu peso en KG. Ejemplo: 65");
        int peso = sc.nextInt();
        
        System.out.println("Ingresa tu altura en metros. Ejemplo: 1.70");
        double estatura = sc.nextDouble();
        
        double imc = peso / (Math.pow(estatura, 2));
        
        
        if(imc < 18){
            System.out.println("Estas bajo de peso");
        }else if(imc < 25){
            System.out.println("Estas en tu peso ideal");
        }else if(imc < 30){
            System.out.println("Estas con sobrepeso");
        }else{
            System.out.println("Estas con obesidad");
        }
       
        System.out.println("Tu IMC es: " + imc);
    }
}
