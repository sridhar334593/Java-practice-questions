public class Operators {
  public static void main(String[] args) {
    solveOperatorsQ1();
    solveOperatorsQ2();
    solveOperatorsQ3();
    solveOperatorsQ4();
    solveOperatorsQ5();
    solveOperatorsQ6();
    solveOperatorsQ7();
    solveOperatorsQ8();
    solveOperatorsQ9();
    solveOperatorsQ10();
    solveOperatorsQ11();
    solveOperatorsQ12();
    solveOperatorsQ13();
    solveOperatorsQ14();
    solveOperatorsQ15();
    solveOperatorsQ16();
    solveOperatorsQ17();
    solveOperatorsQ18();


  }
  public static void solveOperatorsQ1() {
    int a = 10;  
    int b = 5;

    System.out.println("add: " + (a+b));
    System.out.println("sub: " + (a-b));
    System.out.println("mul: " + (a*b));
    System.out.println("div: " + (a/b));
    System.out.println("mod: " + (a%b));
  }

  public static void solveOperatorsQ2() {
    int a = 10;
    System.out.println(a += 5);
    System.out.println(a -= 2);
    System.out.println(a *= 3);
    System.out.println(a /= 2);

  }

  public static void solveOperatorsQ3() {
    System.out.println(17 % 5);
    System.out.println(29 % 4);
    System.out.println(100 % 3);
  }

  public static void solveOperatorsQ4() {
    int a = 5;
    System.out.println("remainder is " + (a % 2));
  }

  public static void solveOperatorsQ5() {
    int a = 20;
    int b = 15;

    System.out.println("a>b " + (a>b));
    System.out.println("a<b " + (a<b));
    System.out.println("a>=b " + (a>=b));
    System.out.println("a<=b " + (a<=b));
    System.out.println("a==b " + (a==b));
    System.out.println("a!=b " + (a!=b));
  }

  public static void solveOperatorsQ6() {
    boolean java = true;
    boolean dsa = false;

    System.out.println(java && dsa);
  }

  public static void solveOperatorsQ7() {
    boolean java = true;
    boolean dsa = false;

    System.out.println(java || dsa);
  }

  public static void solveOperatorsQ8() {
    boolean java = true;
    boolean dsa = false;

    System.out.println(!java);
    System.out.println(!dsa);
  }

  public static void solveOperatorsQ9() {
    int x =10;
    System.out.println("before " + x);
    x++;
    System.out.println(" after " + x);

  }

  public static void solveOperatorsQ10() {
    int y = 10;
    System.out.println("before " + y);
    y--;
    System.out.println("after " + y);
  }

  public static void solveOperatorsQ11() {
   int a = 25;
   int b = 40;
   int ternary = (a>b) ? a : b;
   System.out.println(ternary);

  }

  public static void solveOperatorsQ12() {

    int marks = 82;
    String result = (marks >= 35 ? "pass" : "fail");
    System.out.println(result);
    
  }

  public static void solveOperatorsQ13() {

    int a = 35;
    int b = 50;
    int largest = (a > b) ? a : b ;
    System.out.println(largest);
    
  }

  public static void solveOperatorsQ14() {

    int number = 47;
    String result = ((number % 2 ) == 0) ? "even" : "odd" ;

    System.out.println(result);
  }

  public static void solveOperatorsQ15() {
    
    int age = 17;
    String result = (age >= 18) ? "eligible to vote" : "not eligible";
    System.out.println(result);
  }

  public static void solveOperatorsQ16() {

    int num = -12;
     String x = (num > 0 ) ? "positive num " : "negative num ";
     System.out.println(x);
    
  }

  public static void solveOperatorsQ17() {

    int year = 2028;
    String result = (( year % 4) == 0 ) ? "leap year" : "not leap year";
    System.out.println(result);
    
  }

  public static void solveOperatorsQ18() {

    int a = 25;
    int b = 40;
    int c = 15;

    int result = (a > b &&  a > c) ? a : (b > c) ? b : c;
    System.out.println(result);
    
  }

  
}
