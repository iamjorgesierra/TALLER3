
package taller3;

import java.util.Scanner;


public class PUNTO7 {
    public static void main(String[] args) {
        System.out.println("****PROGRAMA PARA CALULAR NUMERO MAYOR****");
        int contador=10, my=0, num;
        Scanner leer = new Scanner(System.in);  
        for (int i = 0; i < contador; i++) {
            System.out.println("Por favo digite el numero "+(i+1));
            num=leer.nextInt();
            if(i==0){
                my=num;  
            }else if(num>my){
            my=num;}
        }
        System.out.println("De todos los numeros el mayor es: "+ my);
        System.out.println("By Jorge Sierra");
    }
}
