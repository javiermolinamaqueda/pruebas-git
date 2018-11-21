import java.util.Scanner;
public class ej17 {
  public static void main (String[] args){
    Scanner s=new Scanner (System.in);
    int [] n=new int [10];
    for(int i=0; i<10; i++){
      n[i]=(int)(Math.random()*101);
      System.out.print(n[i]+" ");
    }
      System.out.println("introduce un numero: ");
      int numero;
      boolean igual=false;
    do{
      numero=s.nextInt();
      for(int i=0; i<10; i++){
        for (int r: n){
          if(numero==r){
            igual=true;
          }
        }
      } 
    }while(!igual);
    int x=0;
    while(n[0]!=numero){
      x=n[9];
      for(int i=9; i>0; i--){
        n[i]=n[i-1];
      }
      n[0]=x;
    }  
    
    
    for(int i=0; i<10; i++){
      System.out.print(n[i]+" ");
    }
    
    
    
  }
}

