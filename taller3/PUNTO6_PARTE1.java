
package taller3;

import java.util.Scanner;


public class PUNTO6_PARTE1 {
    public static void main(String[] args) {
        System.out.println("****PROGRAMA PARA CONVERTIR DATOS BINARIOS A DECIMAL****");
         int nb, n1, rta=0, exp=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Para conertir un numero binario a decimal digite (B)\n Para convertir de un numero decimal a binario digite (D)");
        String Respuesta = leer.next();
        
        if ("B".equals(Respuesta) || "b".equals(Respuesta)) {
        System.out.println("Por favor digite un numero binario: ");
        nb=leer.nextInt();
        do{
            n1=nb%10;
            rta=rta+n1*(int)Math.pow(2, exp);
            exp++;
            nb=nb/10;
        }while(nb>0);
        System.out.println("El numero binario: "+nb+" convertido a decimal es: "+rta);
        System.out.println("By Jorge Sierra");
         } else if  ("D".equals(Respuesta) || "d".equals(Respuesta)) {
             int dl, md, aux;
        String bno="";
        System.out.println("Por favor digite un numero Decimal: ");
        dl=leer.nextInt();
        aux=dl;
        while(dl > 0){
            md = (dl%2);
            bno = md + bno;
            dl = dl/2;    
        }
        System.out.println("El numero decimal: "+dl+" convertido a binario es: "+bno);
        System.out.println("By Jorge Sierra");
    }
    }
}
