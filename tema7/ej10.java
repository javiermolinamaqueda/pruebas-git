import java.util.Scanner;
public class ej10 {
  public static void main (String[] args){
    Scanner s=new Scanner (System.in);
    int [] n= new int[20];
    int [] par= new int[20];
    int [] impar= new int[20];
    int numpar=0;
    int numimpar=0;
      for (int i=0; i<20; i++) {
        n[i]=(int)(Math.random()*101);
      }
    
       for(int i=0; i<20; i++){
        System.out.print(n[i]+"  ");
      }
      System.out.println();
      for (int i=0; i<20; i++){
        if (n[i]%2==0){
          par[numpar]=n[i];
          numpar++;
        } else{
          impar[numimpar]=n[i];
          numimpar++;
          }
      }
      
      for(int i=0; i<numpar; i++){
        n[i]=par[i];
      }
      
      for(int i=0; i<numimpar; i++){
        n[i+numpar]=impar[i];
      }
      
      for(int i=0; i<20; i++){
        System.out.print(n[i]+"  ");
      }
      
  }
}

