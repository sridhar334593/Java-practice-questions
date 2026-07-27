import java.util.Scanner;

public class IfElse2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    System.out.print("enter marks: ");
    int mark = sc.nextInt();

   if (mark >= 35 && mark <= 100 ){
    System.out.print("pass");
   } 
   else{
    System.out.print("fail");
   }
  }
  
}
