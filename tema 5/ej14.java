import java.util.Scanner;
public class ej14 {
  public static void main (String [] args){
    Scanner s=new Scanner(System.in);
    System.out.print("introduce una base: ");
    int base=s.nextInt();
    System.out.print("introduce un exponente: ");
    int exp=s.nextInt();
    int resultado=1;
      for(int i=0; i<exp; i++){
        resultado *=base;
      }
      System.out.println("la potencia es: "+resultado);
  }
}
