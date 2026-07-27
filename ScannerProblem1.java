import java.util.Scanner;

public class ScannerProblem1 {
  public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
   System.out.print("Enter your name: ");
   String name = sc.nextLine();
   System.out.print("Enter your age: ");
   int age = sc.nextInt();
   sc.nextLine();                            // note important
   System.out.print("Enter your city: ");
   String city = sc.nextLine();
   System.out.print("Enter your mobile number: ");
   String mobile = sc.nextLine();

   System.out.println("---personal details---");
   System.out.println("name   : " + name);
   System.out.println("age    : " + age);
   System.out.println("city   : " + city);
   System.out.println("mobile : " + mobile);
   
  }
}
