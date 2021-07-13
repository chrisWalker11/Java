import java.util.Scanner;
public class Temp {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int option = 0;
        double cTemp = 0.0;
        double fTemp = 0.0;
System.out.println("Enter 1 to convert from F to C or 2 to convert C to F: ");
    option = keyboard.nextInt();
if(option == 1) {
System.out.println("Enter  the F temp: ");
    fTemp = keyboard.nextDouble();
    cTemp = (fTemp -32) * (5.0 / 9.0);
    System.out.println("The temp in C is " + cTemp);
}
else if (option == 2){
System.out.println("Enter the C temp: ");
    cTemp = keyboard.nextDouble();
    fTemp = (cTemp * 9.0 /5.0) + 32;
    System.out.println("The temp in F is " + fTemp);
}
else {
    System.out.println("Incorrect option of " + option);
}
}
}
