public class Advance extends Ticket {
    private double price;

    public Advance(int days) {
        super();

        if (days >= 10) {
            price = 30.0;
        } else {
            price = 40.0;
        }
    }

    @Override
    public double getPrice() {
        return price;
    }
} // end class Advance
