import java.util.Scanner;

public class PrimitiveTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is an integer you like? ");
        int a = in.nextInt();
        System.out.println("What is a double you like? ");
        double b = in.nextDouble();
        System.out.println("the value of a is " + a);
        System.out.println("the value of b is " + b);
        System.out.println("the value of a + b is " + (a + b));
        System.out.println("the value of (int) b / a is " + ((int) b / a));
    }
}
