import java.util.*;

public class penpencileraser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pencil Price: ");
        float pencil = sc.nextFloat();
        System.out.print("Pen Price: ");
        float pen = sc.nextFloat();
        System.out.print("Eraser Price: ");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println("Total = " + total);

        float finalBill = total + (0.18f * total);
        System.out.println("Bill with 18% GST = " + finalBill);
    }
}
