import java.util.Scanner;

public class ifElse1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter mark: ");
    int mark = sc.nextInt();

    if (mark >= 90) {
      System.out.println("Grade A");
    }
    else{
      System.out.println("try again");
    }

  }
  
}
