public class Rose extends Flower {
    private String petalColor;

    public Rose(double mH, double h, int pCt, String pCol) {
        super(mH, h, pCt);
        this.petalColor = pCol;
    }

    public void poke() {
        System.out.println("Ouch!");
    }

    @Override
    public void grow() {
        super.grow();
        super.grow();
    }

    @Override
    public String toString() {
        String output = super.toString();
        output += "\n petal color: " + this.petalColor;
        output += "\n warning: roses are thorny and may poke you";
        return output;
    }
}
