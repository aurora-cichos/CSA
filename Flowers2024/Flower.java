public class Flower {
    private double maxHeight;
    private double height;
    private int petalCount;

    public Flower(double mH, double h, int pC) {
        this.maxHeight = mH;
        this.height = h;
        this.petalCount = pC;
    }

    public double getHeight() {
        return this.height;
    }

    public double getMaxHeight() {
        return this.maxHeight;
    }

    public void increaseHeight(double growth) {
        this.height += growth;
    }

    public void grow() {
        this.height = (this.height + this.maxHeight) / 2.0;
    }

    public String toString() {
        String output = "Flower:";
        output += "\n height: " + height + " cm";
        output += "\n# of petals: " + petalCount;
        return output;
    }
}
