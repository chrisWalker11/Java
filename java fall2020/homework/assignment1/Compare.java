import java.util.Scanner;

public class Compare {
  public static void main( String[] args ) {
    int a,b,c,largest,temp;
      System.out.println( "this a java program to find the largest of three numbers" );
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    a = sc.nextInt();
    System.out.println("Enter number");
    b = sc.nextInt();
    System.out.println("Enter number");
    c = sc.nextInt();
    temp=a>b?a:b;
    largest=c>temp?c:temp;
    System.out.println("The largest number is " + largest );
  }
}
