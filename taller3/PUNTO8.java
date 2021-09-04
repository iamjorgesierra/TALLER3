
package taller3;

import java.util.Scanner;


public class PUNTO8 {
     public static void main(String[] args) {
        System.out.println("*****PROGRAMA DE CUADRADOS*****");
        int num, i, j;
        Scanner leer= new Scanner(System.in);
        System.out.print("Por favor digite el tamaño del cuadrado entre los rangos (1,20): ");
        num = leer.nextInt();    
        if(num >= 0 && num<=20) {
            for( i = 0; i < num; i++) {
            System.out.print("*");
            }
            System.out.println();
            for( i = 0; i < num-2; i++) {
            System.out.print("*");
            for( j = 0; j < num-2; j++) {
            System.out.print(" ");
                }
            System.out.println("*");
            }
            for( i = 0; i < num; i++) {
            System.out.print("*");
            }
        }else {
            System.out.println("EL TAMAÑO DIJITADO SE ENCUENTRA FUERA DE RANGO");
        }
        System.out.println("By Jorge Sierra");         
    }
}
