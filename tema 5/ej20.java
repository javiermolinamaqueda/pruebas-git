import java.util.Scanner;
public class ej20 {
  public static void main (String [] args){
    Scanner s=new Scanner(System.in);
    System.out.print("introduce la altura de la piramide: ");
    int h=s.nextInt();
    System.out.print("introduce el caracter: ");
    String x=System.console().readLine();
      for(int i=1; i<=h; i++){
        for(int j=1; j<=h-i; j++){
          System.out.print(" ");
        }
          System.out.print(x);
            for(int f=2; f<i*2-1; f++){
              if(i==h){
                System.out.print(x);
              } else {
                  System.out.print(" ");
                }
            }
              if(i==1){
                System.out.println("");
              } else{
                  System.out.println(x);
                }
      }
  }
}
