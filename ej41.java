public class ej41 {
  public static void main(String[] args) {

    System.out.print("dime un dia de la semana: ");

    String dia=System.console().readLine();
    
    if (dia.equals("lunes")) {
        System.out.print("el lunes toca prog");
      } else if (dia.equals("martes")) {
          System.out.print("el martes toca FOL");
  
        } else if (dia.equals("miercoles")){
        System.out.print("el miercoles toca BD");
    }
  }
}

