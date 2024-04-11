public class IceHero extends Superhero {
    public int freezeTemp;

    public IceHero (String name, int freezeTemp) {
        super(name);
        this.freezeTemp = freezeTemp;
    }

    public boolean willFreezeWater() {
        return freezeTemp < 32;
    }

    @Override
    public String getMotto() {
        return "It's cold outside.";
    }
}
