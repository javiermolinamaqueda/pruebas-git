import java.util.Scanner;
public class ej1 {
  public static void main (String[] args){
    Scanner s=new Scanner (System.in);
    int tirada=0;
      for (int i=1; i<=3; i++){
        int dado=(int)(Math.random()*6+1);
        System.out.println(i+" tirada: "+dado);
        tirada= tirada+dado;
      }
      System.out.print("la suma de las tiradas es: "+tirada);
      
  }
}

