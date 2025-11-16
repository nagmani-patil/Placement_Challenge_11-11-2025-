//Take 3 numbers (int, int, double)
//Find their average with exactly 2 decimal places
import java.util.Scanner;
public class AverageCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 integers and 1 double: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();

        double avg = (a + b + c) / 3;  // automatic type promotion
        System.out.printf("Average = %.2f", avg);
    }
}
