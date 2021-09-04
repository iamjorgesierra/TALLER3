
package taller3;

import java.util.Scanner;

public class PUNTO11_EJECUTAR {
    public static void main(String args[]){  
    System.out.println("*****PROGRAMA PARA INVERTIR NUMEROS ENTEROS****");
    Scanner entrada = new Scanner(System.in);
    int num;
    PUNTO11 miObjeto = new PUNTO11();

    System.out.println("Por favor introduzca un numero entero:  ");
    num = entrada.nextInt();

    System.out.println("\nA continuacion el numero ingresado invertido: \n ");
    miObjeto.Invierte(num);

 
 }          
}
