public class Trio {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;
    
    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }
    
    public String getName() {
        String output = "";
        output += sandwich.getName() + "/";
        output += salad.getName() + "/";
        output += drink.getName();
        return output;
    }

    public double getPrice() {
        double sW = sandwich.getPrice();
        double s = salad.getPrice();
        double d = drink.getPrice();

        if (sW <= s && sW <= d) {
            return s + d;
        } else if (s <= sW && s <= d) {
            return sW + d;
        } else {
            return sW + s;
        }
    } 
} // end class Trio
