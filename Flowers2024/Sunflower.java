public class Sunflower extends Flower {
    private boolean isHappy;

    public Sunflower(double mH, double h, int pC, boolean iH) {
        super(mH, h, pC);
        this.isHappy = iH;
    }

    public void sunrise() {
        System.out.println("The sun is rising :D");
        this.grow();
    }

    public void sunset() {
        System.out.println("The sun is setting D:\nSunflower is sad D:");
        this.isHappy = false;
    }

    @Override
    public void grow() {
        super.grow();
        isHappy = true;
        System.out.println("Sunflower is happy :D");
    }

    @Override
    public String toString() {
        String output = super.toString();
        if (isHappy) {
            output += "\n sunlower is currently happy :D";
        } else {
            output += "\n sunlower is currently not happy D:";
        }
        return output;
    }
}
