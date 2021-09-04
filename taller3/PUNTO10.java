
package taller3;

import java.util.Scanner;


public class PUNTO10 {
     public void EJECUCION(){
        System.out.println("****PARQUEADERO****");
        Scanner leer = new Scanner(System.in);
        double hr=0;
        double Cargo = 0;
        double Total = 0;
        int Contador = 1;
    
        System.out.println("Programa de cobro del parqueadero.");
        System.out.printf("Por favor ingrese la cantidad de horas del parqueo %d:\n", Contador++);
        System.out.print("Oprima el numero 0 para finalizar.\n ");
        hr=leer.nextDouble();
        while (0!=hr){     
        System.out.printf("\nEl saldo del vehiculo es: %.2f", Cargo(hr));
        Total+=Cargo(hr);
        System.out.printf("\nPor favor ingrese la cantidad de horas del parqueo %d:\n", Contador++);
        System.out.print("Oprima el numero 0 para finalizar.\n ");
        hr=leer.nextDouble();
        } 
        System.out.printf("\nEl cargo total del parqueo es: %.2f\n", Total);
        }   



    public double Cargo( double x){    

        if ( 3 >= x )
            return 2.0;

            else
                return (2 + 0.5*Math.ceil(x - 3)) <= 10? 2 + 0.5*Math.ceil(x -3) : 10; 
}
}