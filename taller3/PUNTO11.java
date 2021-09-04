
package taller3;

  
 
public class PUNTO11 {     
 public int Calcular( int x ){
 int dv = 1,cont = 0,dgt = 1;
 while ( 0 != dgt )
 {      
 dgt = x / dv;
 dv *= 10;
 cont++;
 }      
 return --cont;
 }      

 public void Invierte (int y ) {         
 int dgt=Calcular(y);
 for (int i = 1; i < dgt; i++){       
 System.out.printf("\t%d", y % 10);     
 y /= 10;        
 }       
 System.out.printf("\t%3d", y);
 System.out.println("\n");
 }
}
