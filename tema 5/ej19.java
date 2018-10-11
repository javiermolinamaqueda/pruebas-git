import java.util.Scanner;
public class ej19 {
  public static void main (String [] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("dame la altura de la piramide: ");
    int altura=s.nextInt();
    System.out.print("dime el caracter: ");
    String carac=System.console().readLine();
    int contespacio=altura-1;
    int contcarac=1;
    for(int i=0; i<altura; i++) {
      
      for(int f=0; f<contespacio; f++){
        System.out.print(" ");
        
      }
        for(int g=0; g<contcarac; g++){
          System.out.print(carac);
          
        }
        
      System.out.println("");
      contespacio--;
      contcarac=contcarac+2;
    }
  }
}
