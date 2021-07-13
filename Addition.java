import java.util.Scanner;
class Addition {
  public static void main( String args[] ) {
    int a, b ,c; 
      System.out.println( "This is a java program for addition." );
      Scanner in = new Scanner(System.in);
    
      System.out.println( "Enter number." );
      a = in.nextInt();
    System.out.println( " Enter number." );
    b = in.nextInt();
    c = a + b;
      System.out.println( a + " + " + b + " = " + c);
  }
}
