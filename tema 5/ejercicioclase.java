import java.util.Scanner;
public class ejercicioclase {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
      for(int a=0; a<=9; a++){
        for(int b=0; b<=9; b++){
          for(int c=0; c<=9; c++){
            System.out.println(a+"-"+b+"-"+c);
          }
        }
      }
  }
}
