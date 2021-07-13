import java.util.*;
import java.text.*;

public class FirstProg {
  public static void main ( String[] args ) {
    Date dNow = new Date( );
    SimpleDateFormat ft1 = new SimpleDateFormat ("MM/dd/yyyy");
    System.out.println( "I, Chris, am determined to learn how to code." );
    System.out.println("The current date is " + ft1.format(dNow));
  }
}
