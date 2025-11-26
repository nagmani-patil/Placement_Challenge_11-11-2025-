import java.util.*;

public class Areaofsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side: ");
        int side = sc.nextInt();

        int area = side * side;
        System.out.println("Area = " + area);
    }
}
