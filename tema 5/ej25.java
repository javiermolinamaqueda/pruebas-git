import java.util.Scanner;
public class ej25 {
  public static void main (String[] args){
    Scanner s=new Scanner (System.in);
    System.out.print("introduce un numero, a continuacion se mostrara ese numero al reves: ");
    int h=s.nextInt();
    int divisor=10;
    int resto=0;
    int cociente=0;
      do{
        resto=h%divisor;
        cociente=h/divisor;
        h=cociente;
        
        System.out.print(resto);
      } while(cociente>0);
      
  }
}
