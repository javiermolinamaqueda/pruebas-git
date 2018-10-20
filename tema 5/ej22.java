
public class ej22 {
  public static void main (String [] args){
    
    boolean esprimo;
    for(int i=2; i<=100; i++) {
      esprimo=true;
        for(int j=2; (j<i) && esprimo; j++) {
          if((i%j)==0){
            esprimo=false;
          }
        }
        if(esprimo) {
          System.out.println(i);
        }
    }
  }
}
