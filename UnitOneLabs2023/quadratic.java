class Quadratic {
    public static void main(String args[]) {
        int a = 1;
        int b = -2;
        int c = -15;
        
        System.out.println("Your equation: " + a + "x^2 + " + b + "x + " + c);

        double bSquared = Math.pow(b, 2);
        double fourAC = 4 * a * c;
        double bSquaredMinusFourAC = bSquared - fourAC;
        System.out.println("Discriminate value is " + bSquaredMinusFourAC);

        double firstRoot = (-b + Math.sqrt(bSquaredMinusFourAC)) / (double) 2 * a;
        double secondRoot = (-b - Math.sqrt(bSquaredMinusFourAC)) / (double) 2 * a;

        System.out.println("Roots are real and can be calculated");
        System.out.println("Positive root: " + firstRoot);
        System.out.println("Negative root: " + secondRoot);
    }
}
