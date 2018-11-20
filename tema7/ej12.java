import java.util.Scanner;
public class ej12 {
  public static void main (String[] args){
    Scanner s=new Scanner (System.in);
    System.out.println("introduce 10 numeros: ");
    int [] array=new int[10];
    int inicial;
    int nfinal;
    int [] array2=new int[10];
    for(int i=0; i<10; i++){
      array[i]=s.nextInt();
    }
    do{
      System.out.print("Introduce la posicion inicial: ");
      inicial=s.nextInt();
      System.out.print("Introduce la posicion final: ");
      nfinal=s.nextInt();
    }while(inicial>nfinal||inicial>10||nfinal>10);
    
    for(int i=0; i<10; i++){
      System.out.print(array[i]+", ");
    }
    for(int i=0; i<10; i++){
      array2[i]=array[i];
    }
    
    array2[nfinal]=array[inicial];
    
    for(int i=nfinal+1; i<10; i++){
      array2[i]=array[i-1];
    }
    array2[0]=array[9];
    
    for(int i=0; i<inicial; i++){
      array2[i+1]=array[i];
    }
    System.out.println("");
    for(int i=0; i<10; i++){
      System.out.print(array2[i]+", ");
    }
  }
}

