import java.util.Scanner;

public class ScannerProblem {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter your full name: ");
  String name = sc.nextLine();
  System.out.print("Enter your age: ");
  int age = sc.nextInt();
  System.out.print("Enter your CGPA: ");
  Float CGPA = sc.nextFloat();

  System.out.println("---Student details---");
  System.out.println("Name : " + name);
  System.out.println("Age : " + age);
  System.out.println("CGPA : " + CGPA);

  }
}
