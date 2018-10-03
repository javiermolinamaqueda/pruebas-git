import java.util.Scanner;
public class ej24 {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("1. programador junior");
    System.out.println("2. programador senior");
    System.out.println("3. jefe de proyecto");
    System.out.print("introduzca el cargo del empleado(1-3):");
    int cargo=Integer.parseInt(s.nextLine());
    System.out.print("cuantos dias ha estado de viaje?");
    int dias=Integer.parseInt(s.nextLine());
    System.out.print("introduzca estado civil:1.soltero,2.casado:");
    int civil=Integer.parseInt(s.nextLine());
    double sueldobase=0;
    double dietas=0;
    double sueldobruto=0;
    double retencion=0;
    double sueldoneto=0;
      switch (cargo){
        case 1:
        sueldobase=950;
        dietas=30*dias;
        sueldobruto=dietas+sueldobase;
        if (civil==1){
          retencion=0.2*sueldobruto;
        }
             if(civil==2){
              retencion=0.25*sueldobruto;
            }
        
        sueldoneto=sueldobruto-retencion;
        break;
        
        case 2:
        sueldobase=1200;
        dietas=30*dias;
        sueldobruto=dietas+sueldobase;
        if (civil==1){
          retencion=0.2*sueldobruto;
        }  
             if(civil==2){
              retencion=0.25*sueldobruto;
            }
        
        sueldoneto=sueldobruto-retencion;
        break;
        
        case 3:
        sueldobase=1600;
        dietas=30*dias;
        sueldobruto=dietas+sueldobase;
        if (civil==1){
          retencion=0.2*sueldobruto;
        }  
             if(civil==2){
              retencion=0.25*sueldobruto;
            }
        
        sueldoneto=sueldobruto-retencion;
        break;
          
      }
      System.out.print("--------------------\n");
      System.out.printf("Sueldo base: %7.2f\n", sueldobase);
      System.out.printf("Dietas: %7.2f\n", dietas);
      System.out.print("--------------------\n");
      System.out.printf("Sueldo bruto: %7.2f\n", sueldobruto);
      System.out.printf("Retencion IRPF: %7.2f\n", retencion);
      System.out.print("--------------------\n");
      System.out.printf("Sueldo neto: %7.2f\n", sueldoneto);
      
        
  }
}
