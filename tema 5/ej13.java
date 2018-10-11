import java.util.Scanner;
public class ej13 {
  public static void main (String [] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("introduce 10 numeros: ");
    int numerosnegativos=0;
    int numerospositivos=0;
    for(int i=0; i<10; i++){
      System.out.print("numero= ");  
      int x=s.nextInt();
      if (x<0) {
        numerosnegativos++;
      }    
        else{
          numerospositivos++;
        }
    }
    System.out.println("numeros positivos: "+numerospositivos);
    System.out.println("numeros negativos: "+numerosnegativos);
  }
}
