import java.util.Scanner;
public class ej11 {
  public static void main (String[] args){
    Scanner s=new Scanner (System.in);
    int [][]cuadrado=new int[10][10];
    int mayor=200;
    int menor=300;
    int media=0;
    for(int i=0;i<10;i++){
      for(int j=0;j<10;j++){
        cuadrado[i][j]=(int)(Math.random()*101+200);
      }
    }
    for(int i=0;i<10;i++){
      for(int j=0;j<10;j++){
        if (i==j){
          System.out.println(cuadrado[i][j]+"  ");
          media=media+cuadrado[i][j];
            if(cuadrado[i][j]<menor){
              menor=cuadrado[i][j];
            }
              if(cuadrado[i][j]>mayor){
                mayor=cuadrado[i][j];
              }
        }
      }
    }
    System.out.print("la media es: "+media/10+", el mayor es: "+mayor+", el menor es: "+menor);
      
  }
}


