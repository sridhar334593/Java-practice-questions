public class Main {
  public static void main(String[] args) {
    solveVariablesQ1();
    solveVariablesQ2();
    solveVariablesQ3();
    solveVariablesQ4();
    solveVariablesQ5();
    solveVariablesQ6();
    solveVariablesQ7();
    solveVariablesQ8();
    solveVariablesQ9();
    solveVariablesQ10();
    solveVariablesQ11();
    solveVariablesQ12();
    solveVariablesQ13();
    solveVariablesQ14();
    solveVariablesQ15();
    solveVariablesQ16();
    solveVariablesQ17();
    solveVariablesQ18();
    solveVariablesQ19();
    solveVariablesQ20();
    solveVariablesQ21();
    solveVariablesQ22();
    solveVariablesQ23();
  }

 

  public static void solveVariablesQ1() {
    int age = 25;
    System.out.println("Age: " + age);
  }

  public static void solveVariablesQ2() {
   double height = 5.5;
    System.out.println("height: " + height + " m");
  }

  public static void solveVariablesQ3() {
    String name = "Sridhar";
    System.out.println("First letter of name: " + name.charAt(0));
  }
  // store 1st letter and printit
  //char firstletter = 's';
  //System.out.println("First letter of name: " + firstletter);

  public static void solveVariablesQ4() {
    boolean pass = true;
    System.out.println("Has passed: " + pass);
  }

  public static void solveVariablesQ5() {
    String name = "Sridhar";
    int Age = 20;
    double CGPA = 8.4;
    System.out.println("Name: " + name);
    System.out.println("Age: " + Age);
    System.out.println("CGPA: " + CGPA);
  }

  public static void solveVariablesQ6() {
   int a = 15;
   int b = 25;
   int c = a + b;
   System.out.println("Sum: " + c);
  }

  public static void solveVariablesQ7() {
    double pi = 3.14159;
    System.out.println("Value of pi: " + pi);
  }

  public static void solveVariablesQ8() {
   double price = 65000.75;
   System.out.println("Price of laptop: $" + price);
  }

  public static void solveVariablesQ9() {
    byte a =1;
    short b = 20;
    int c = 3000;
    long d = 40000L;
    float e = 5.00000f;
    double f = 6.0000000;
    char g = 'A';
    boolean h = true;
    System.out.println("Byte: " + a + ", Short: " + b + ", Int: " + c + ", Long: " + d + ", Float: " + e + ", Double: " + f + ", Char: " + g + ", Boolean: " + h   );

  }

  public static void solveVariablesQ10() {
    int a =10, b = 20, c = 30, d = 40, e = 50;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
  }

  public static void solveVariablesQ11() {
   String firstName = "sridhar";
   String lastName = "s";
   System.out.println("Full name: " + firstName + " " + lastName);

  }

  public static void solveVariablesQ12() {
    int a = 10;
    int b = 20;
    int c = 30;
    int avg = (a + b + c)/3;
    System.out.println("Average: " + avg);
  }

  public static void solveVariablesQ13() {
    int radius = 7;
    double area  = 3.14 * radius * radius;
    System.out.println("Area of circle: " + area);
  }

  public static void solveVariablesQ14() {
    int length = 5;
    int breadth = 10;
    int area = length * breadth;
    int perimeter = 2 * (length + breadth);
    System.out.println("Area of rectangle: " + area);
    System.out.println("Perimeter of rectangle: " + perimeter); 
  }

  public static void solveVariablesQ15() {
   int tamil = 99;
   int english = 87;
   int maths = 99;
   int science = 99;
    int social = 99;
   int total = tamil + english + maths + science + social;
    System.out.println("Total marks: " + total);
  }

  public static void solveVariablesQ16() {
    int totalMarks = 500;
    int obtainedMarks = 450;
    double percentage = (obtainedMarks * 100.0) / totalMarks;
    System.out.println("Percentage: " + percentage + "%");
  }

  public static void solveVariablesQ17() {
    int a = 10;
    int b = 20;

    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println(a);
    System.out.println(b);
   }

  public static void solveVariablesQ18() {
     int a = 10;
     int b = 20;
     int temp;

     temp = a; // temp = 10
     a = b;    // a = 20
     b = temp; // b = 10
     System.out.println("a = " + a + " " + "b = " + b);
   }

  public static void solveVariablesQ19() {
     int principal = 100;
     int rate = 25;
     int time = 12;
     double simpleinterest = principal * rate * time;
     System.out.println(simpleinterest);
   }

   public static void solveVariablesQ20() {
    float celsius = 32.5f;
    float fahrenheit = (celsius * 9/5) + 32;
    System.out.println(fahrenheit);
   }

   public static void solveVariablesQ21() {
    int km = 1000;
    int m = km * 1000;
    int cm = m * 100;
    System.out.println("kilometer = " + km);
    System.out.println("meter = " + m);
    System.out.println("centimeter = " + cm);
   }

   public static void solveVariablesQ22() {
    double hours = 10;
    double minutes = 60 * hours;
    long seconds = (long) (60 * 60 * hours);  // (NOTE) if value is given long = 132443L; 
    System.out.println("hours= " + hours);
    System.out.println("minutes= " + minutes);
    System.out.println( "seconds= " + seconds);
   }

   public static void solveVariablesQ23() {
    int annualsalary = 500000;
    float monthlysalary = (float) (annualsalary / 12 );
    System.out.println("monthlysalary is = " + monthlysalary); 
   }

  }


