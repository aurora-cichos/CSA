public class Driver {
    public static void main(String[] args) {
        Flower f = new Flower(25, 10, 4);
        System.out.println(f.toString());
        f.grow();
        System.out.println(f.toString());

        Rose r = new Rose(15, 3, 12, "Pink");
        System.out.println(r.toString());
        r.poke();
        r.grow();
        System.out.println(r.toString());

        Sunflower sF = new Sunflower(60, 20, 8, false);
        System.out.println(sF.toString());
        sF.sunrise();
        System.out.println(sF.toString());
        sF.sunset();
        System.out.println(sF.toString());

        FlowerBox fB = new FlowerBox(3);
        fB.pushFlower(f);
        fB.pushFlower(r);
        fB.pushFlower(sF);
        fB.printAll();

    }
}
