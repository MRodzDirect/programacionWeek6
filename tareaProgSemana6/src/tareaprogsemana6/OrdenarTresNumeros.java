//Ordenamiento de Tres Números: Dados tres números,
//ordenarlos en orden ascendente.
package tareaprogsemana6;

import java.util.Scanner;

/**
 *
 * @author Emma Watson 
 */
public class OrdenarTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Ingresa 3 numeros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        if(num1 >= num2 && num2 >= num3){
            System.out.println("Los numeros ordenados: " + num3 + ", " + num2 + ", " + num1);
            
        }  else if(num1 >= num3 && num3 >= num2){
            System.out.println("Los numeros ordenados: " + num2 + ", " + num3 + ", " + num1);
            
        } else if(num2 >= num3 && num3 >= num1){
            System.out.println("Los numeros ordenados: " + num1 + ", " + num3 + ", " + num2);
            
        }else if(num2 >= num1 && num1 >= num3){
            System.out.println("Los numeros ordenados: " + num3 + ", " + num1 + ", " + num2);
            
        } else if(num3 >= num2 && num2 >= num1){
            System.out.println("Los numeros ordenados: " + num1 + ", " + num2 + ", " + num3);
        }
         else if(num3 >= num1 && num1 >= num2){
            System.out.println("Los numeros ordenados: " + num2 + ", " + num1 + ", " + num3);
        }
    }
}
