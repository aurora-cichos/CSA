public class FireHero extends Superhero {
    private int heatTemp;

    public FireHero(String name, int heatTemp) {
        super(name);
        this.heatTemp = heatTemp;
    }

    @Override
    public String getMotto() {
    return "It's warm outside.";
    }
}
