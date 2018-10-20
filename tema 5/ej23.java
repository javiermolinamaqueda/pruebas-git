import java.util.Scanner;
public class ej23 {
  public static void main (String [] args){
    Scanner s=new Scanner(System.in);
    System.out.println("introduce numeros hasta que su suma supere 10.000");
    int suma=0;
    int num;
    int cont=0;
    int media=0;
    do {
      num=s.nextInt();
      suma=suma+num;
      cont++;
    } while(suma<=10000);
    media=suma/cont;
    System.out.print("el acumulado es: "+suma+", ha introducido: "+cont+" numeros y la media de ellos es: "+media);
  }
}
