import java.util.Scanner;
public class ej9 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("dime un numero: ");
    int num=Integer.parseInt(s.nextLine());
    int n=0;
      while(num>=Math.pow(10,n)){
      n++;
      }
        System.out.print("este numero tiene: "+n+" digitos");
  }
}
