class Two {
    public static void main(String args[]) { 
        int x1 = 1;
        int x2 = 3;
        int y1 = 1;
        int y2 = 3;
    
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The first point is: (" + x1 + ", " + y1 + ")");
        System.out.println("The second point is (" + x2 + ", " + y2 + ")");
        System.out.println("Distance is: " + distance);
    }
}
