import java.util.Scanner;
public class ej24 {
  public static void main (String[] args){
    Scanner s=new Scanner (System.in);
    System.out.print("introduce el numero de filas: ");
    int h=s.nextInt();
      for(int i=1; i<=h; i++){
        for(int j=1; j<=h-i; j++){
          System.out.print(" ");
        }
          for(int z=1; z<=i; z++){
            System.out.print(z);
          }
            for(int g=1; g<=(i-1); g++){
              System.out.print(i-g);
            }
          System.out.println("");
      }
  }
}
