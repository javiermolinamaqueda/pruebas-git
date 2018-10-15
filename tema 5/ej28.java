import java.util.Scanner;
public class ej28 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("introduce un numero y a continuacion se calculara su factorial: ");
    int num=s.nextInt();
    int mult=1;
      for(int a=1; a<=num; a++) {
        mult=mult*a;
      }
      System.out.println(mult);
  }  
}
