import java.util.Scanner;
public class ej8 {
  public static void main (String[] args){
    Scanner s=new Scanner (System.in);
      for(int partidos=1; partidos<=15; partidos++){
        if(partidos>=10){
          System.out.print(partidos+". ");
        } else {
            System.out.print(partidos+".  ");
          }
        for(int columnas=1; columnas<=3; columnas++){
          int apuesta=(int)(Math.random()*6+1);
            if((apuesta==1)||(apuesta==2)||(apuesta==3)){
              System.out.print("1  | ");
            }
                if(apuesta==4||apuesta==5){
                  System.out.print(" x | ");
                }
                  if(apuesta==6){
                    System.out.print("  2| ");
                  }
        }
        System.out.println("");
      }
  }
}

