public class StudentAdvance extends Advance {
    public StudentAdvance(int days) {
        super(days);
    }

    @Override
    public double getPrice() {
        return super.getPrice() / 2.0;
    }

    @Override
    public String toString() {
        String output = super.toString();
        output += "\nStudent ID required for ticket.";
        return output;
    }
} // end class StudentAdvance
