//Take user name (String) age (int) and percentage (float)  display formatted output.
import java.util.Scanner;
public class UserInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your percentage: ");
        float per = sc.nextFloat();

        System.out.printf("Hello %s, you are %d years old and scored %.2f%%.%n", name, age, per);
    }
}
