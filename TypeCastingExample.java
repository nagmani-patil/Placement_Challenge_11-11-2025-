//Take a double value and convert it into int  then print both.
import java.util.Scanner;
public class TypeCastingExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double value = sc.nextDouble();

        int intValue = (int) value; // Explicit type casting
        System.out.println("Original double: " + value);
        System.out.println("Converted int: " + intValue);
    }
}
