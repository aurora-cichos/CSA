public class Printer3D extends Device {
    private String brand;
    private boolean filament;

    public Printer3D(String c, int m, String b, boolean f) {
        super(c,m);
        brand = b;
        filament = f;
    }

    public void addFilament() {
        filament = true;
    }

    public String toString() {
        String output = "The 3D printer:\n";

        output += super.toString();
        output += "\nThe brand is:" + brand + ".\nThe printer does";
        if (!filament) output += " not"
        output += " have filament."
        return output;
    }
}
