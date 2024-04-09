import java.util.Scanner;

class Numbers {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input integer a:");
        int a = in.nextInt();
        System.out.println("Input integer b:");
        int b = in.nextInt();
        System.out.println("Input integer c:");
        int c = in.nextInt();

        double result = (double) a * b / c;
        int rounded;

        if (result < 0) {
            rounded = (int) (result - 0.5);
        } else {
            rounded = (int) (result + 0.5);
        }

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("result: " + result);
        System.out.println("rounded " + rounded);
    }
}
