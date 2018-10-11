import java.util.Scanner;
public class ej10 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int num=1;
    int media=0;
    int suma=0;
    int divisor=1;
      while(num>0){
      System.out.print("dime un numero: ");
      num=Integer.parseInt(s.nextLine());
        if(num>0) {
        suma=suma+num;
        media=suma/divisor;
        divisor++;
        }
      }
        System.out.print("la media es: "+media);
  }
}
