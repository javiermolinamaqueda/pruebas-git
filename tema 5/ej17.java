import java.util.Scanner;
public class ej17 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("dime un numero: ");
    int num=Integer.parseInt(s.nextLine());
    int num2=0;
    int aux=0;
      for(int i=1; i<=100; i++){
        aux= num;
        num=num2;
        num2=aux+num;
        num=aux+1;
        System.out.println(num+", "+num2);
      }
      System.out.print(num2);
  }
}
