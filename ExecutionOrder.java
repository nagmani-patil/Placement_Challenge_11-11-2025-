//Print a message that shows which part of code executes first, second, and last.
public class ExecutionOrder {
    static {
        System.out.println("1️ Static Block — Executes before main()");
    }

    public static void main(String[] args) {
        System.out.println(" 2️ Main Method — Program starts here");
    }
}
