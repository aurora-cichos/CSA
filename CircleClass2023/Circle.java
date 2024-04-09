public class Circle {
    private double diameter;
    
    /**
     * Constructor for objects of class Circle
     * @param double diameter of Circle
     */
    public Circle(double diameter) {
        this.diameter = diameter;
    }
    
    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        System.out.println("Radius: " + circle.calculateRadius() + "\nCircumference: " + circle.calculateCircumference() + "\nArea: " + circle.calculateArea());
        System.out.println(circle.toString());
        circle.scaleCircle(2.0);
        System.out.println("Arc length 180 degrees: " + circle.calculateArcLength(180));
        System.out.println(circle.toString());
    }
    
    /**
     * Getter for diameter variable
     * @return double diameter of Circle
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * Setter for diameter variable
     * @param double diameter
     * precondition: diameter must be greater than or equal to 0
     */
    public void setDiameter(double diameter) {
        if (diameter >= 0) {
            this.diameter = diameter;
        } else {
            diameter = 0;
        }
    }

    /**
     * Scales diameter of Circle
     * @param double scale to scale the diameter by
     * precondition: scale must be greatere than or equal to 0
     */
    public void scaleCircle(double scale) {
        if (scale >= 0) {
            diameter *= scale;
        } else {
            diameter = 0;
        }
    }

    /**
     * Calculates the radius of Circle
     * @return double radius of Circle
     */
    public double calculateRadius() {
        return diameter / 2;
    }

    /**
     * Calculates the circumference of Circle
     * @return double circumference of Circle
     */
    public double calculateCircumference() {
        return diameter * Math.PI;
    }

    /**
     * Calculates the area of Circle
     * @return double area of Circle
     */
    public double calculateArea() {
        return Math.pow(diameter / 2, 2) * Math.PI;
    }

    /**
     * Calculates the arc length of Circle given certain number of degrees
     * @param double degrees of arc length
     * @return double arc length of Circle given certain number of degrees
     */
    public double calculateArcLength(double degrees) {
        return calculateCircumference() * degrees / 360;
    }
    
    /**
     * toString for Circle object - includes info on all instance variables
     */
    public String toString() {
        return "Diameter: " + diameter;
    }
}
