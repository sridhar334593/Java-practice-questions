import java.util.Scanner;

public class NestedIf1 {
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("card inserted or not(true or false)" );
    boolean card = sc.nextBoolean();
    System.out.print("pin correct(true or false )");
    boolean pin = sc.nextBoolean();

    if(card){

      if(pin){
        System.out.println("cash withdrawn");
      }
      else{
        System.out.println("incorrect pin");
      }

    }

    else{
      System.out.println("please insert card");
    }

    sc.close();
   }  
}
