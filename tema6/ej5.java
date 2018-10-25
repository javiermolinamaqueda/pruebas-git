import java.util.Scanner;
public class ej5 {
  public static void main (String[] args){
    Scanner s=new Scanner (System.in);
    int mayor=0;
    int menor=0;
    int suma=0;
    int media=0;
      for (int i=1; i<=50; i++){
        int num=(int)(Math.random()*100+100);
        System.out.println(num);
          if(num>mayor){
            mayor=num;
          } 
            if(i==1){
              menor=num;
            }
              if(num<menor){
                menor=num;
              }
        suma=suma+num;
      }
      media=suma/50;
      System.out.print("menor: "+menor+", mayor: "+mayor+", la media es: "+media);
      
  }
}

