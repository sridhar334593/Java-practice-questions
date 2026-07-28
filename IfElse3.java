import java.util.Scanner;

public class IfElse3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your mark: ");
    int mark = sc.nextInt();

    if(mark < 0 || mark > 100){
      System.out.println("Invalid mark");
    }

    else if(mark >=90){
      System.out.println("Grade = A");
    }

    else if(mark >=75){
      System.out.println("Grade = B");
    }

    else if(mark >=50){
      System.out.println("Grade = C");
    }

    else if(mark >=35){
      System.out.println("pass");
    }

    else{
      System.out.println("fail");
    }
  }
}
