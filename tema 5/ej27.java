import java.util.Scanner;
public class ej27 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("este programa muestra, cuenta y suma los multiplos de 3 hasta un numero introducido: ");
    int num=s.nextInt();
    int suma=0;
    int cont=1;
    System.out.println(1);
    
      for (int i=3; i<=num; i=i+3){
        System.out.println(i);
        suma=suma+i;
        cont++;
      }
   System.out.println("desde 1 hasta "+num+" hay "+cont+" múltiplos de 3, y la suma de ellos es "+suma);
  }
}

