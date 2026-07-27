import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("enter a bill amount: ");
    int bill = sc.nextInt();

    if(bill >= 1000){
      int discount = bill * 10/100;
      int amt = bill - discount;
      System.out.println("final amount is: " + amt);

    }
    else{
      System.out.println("no discount");
      System.out.println("bill is: " + bill);
    }
  }
}
