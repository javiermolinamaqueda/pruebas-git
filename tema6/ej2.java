import java.util.Scanner;
public class ej2 {
  public static void main (String[] args){
    Scanner s=new Scanner (System.in);
    String letra=("");
    String palo=("");
    int numeropalo=(int)(Math.random()*4+1);
      switch(numeropalo) {
        case 1:
          palo="picas";
          break;
        case 2:
          palo="corazones";
          break;
        case 3:
          palo="diamantes";
          break;
        case 4:
          palo="trebol";
          break;
        default:
      }
      int numeroletra=(int)(Math.random()*13+1);
        switch(numeroletra) {
          case 1:
            letra="A";
            break;
          case 11:
            letra="J";
            break;
          case 12:
            letra="Q";
            break;
          case 13:
            letra="K";
            break;
          default:
            letra=String.valueOf(numeroletra);
        }
      System.out.print(letra+" de "+palo);
      
  }
}


