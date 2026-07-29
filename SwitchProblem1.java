import java.util.Scanner;

public class SwitchProblem1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("=====Calculator=====");
     System.out.println("1. Addition");
     System.out.println("2. Subtraction");
     System.out.println("3. Multiplication");
     System.out.println("4. Division");

     System.out.println();
     System.out.println("enter your choice: ");
     int choice = sc.nextInt();

     System.out.println("enter first number: ");
     int firstnum = sc.nextInt();

     System.out.println("enter second number: ");
     int secondnum = sc.nextInt();


     switch (choice) {

      case 1:
        System.out.println("Addition: " + (firstnum + secondnum));
        break;
      
      case 2:
        System.out.println("Subtraction: " + (firstnum - secondnum));
        break;

      case 3:
        System.out.println("Multiplication: " + (firstnum * secondnum));
        break;

      case 4:

        if (secondnum == 0) {
        System.out.println("Cannot divide by zero.");
        } 

        else {
        System.out.println("Division: " + (firstnum / secondnum));
        }
        break;

      default:
        System.out.println("invalid choice");
      
     
     }

     sc.close();
  }
}
