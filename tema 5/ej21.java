import java.util.Scanner;
public class ej21 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("introduce numeros enteros ");
    System.out.println("termina el programa con un numero negativo ");
    int num;
    int cont=0;
    int mayor=0;
    int cont1=0;
    int suma=0;
      do {
        num=s.nextInt();
        if (num>0){
          if(num%2==0){
            if(num>mayor){
              mayor=num;
            }
          } else{
              suma=suma+num;
              cont1++;
            }
          cont++;
        }
      } while (num>=0);
    int media=suma/cont1;
    System.out.print("ha introducido "+cont+" números, el mayor de los pares es: "+mayor+", y la media de los impares es: "+media);    
  }
}
  

