import java.util.Scanner;

public class NestedIf {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter your attendance percentage from 0 to 100: ");
    int attendance = sc.nextInt();
    System.out.print("fees paid (true/false) ");
    boolean fees = sc.nextBoolean();
    

    if(attendance >= 80){
      if(fees == true){         //if(fees) only enough or if(!fees) = if(fees == false)
        System.out.println("Eligible to write exam");
      }
      else{
        System.out.println("fees not paid" );
      }
    }
    else{
      System.out.println("Attendance shortage ");
    }

    sc.close();
  }
}
