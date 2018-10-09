import java.util.Scanner;
public class ej7 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        
          for(int i=0; i<4; i++){
          System.out.println("teclea una clave de 4 digitos: ");
          int clave=Integer.parseInt(s.nextLine());
            if (clave==1111){
              System.out.println("ha acertado la clave");
              i=5;
            } 
          }
            
  }
}
