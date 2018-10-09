import java.util.Scanner;
public class ej8 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("dime un numero: ");
    int num=Integer.parseInt(s.nextLine());
      for(int i=1; i<11; i++){
        int resultado=num*i;
        System.out.println(num+"x"+i+"="+resultado);  
          }
            
  }
}
