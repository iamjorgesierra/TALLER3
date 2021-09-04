
package taller3;

import java.util.Scanner;


public class PUNTO2 {
    public static void main(String[] args) { 
        System.out.println("****PROGRAMA PARA CALCULAR EL CREDITO DE UNA TIENDA****");
        Scanner leer = new Scanner(System.in);
        int si, am, cac, lc, ct, tl;
        System.out.println("Por favor digite el saldo inicial: ");
        si = leer.nextInt();
        System.out.println("Por favor digite el total del abono realizado al mes: ");
        am = leer.nextInt();
        System.out.println("Por favor digite los cargos del cliente: ");
        cac = leer.nextInt();
        System.out.println("Por favor digite el limite del credito: ");
        lc = leer.nextInt();
        ct = si+am-cac;
        tl =lc-ct;
        if(ct<lc) {
            System.out.println( "Su saldo a favor es de: " + tl);
            System.out.println("Su limite de credito no ha sido excedido");
        } else {
            System.out.println("Su limite de credito ha sido excedido");
        }
    }
}
