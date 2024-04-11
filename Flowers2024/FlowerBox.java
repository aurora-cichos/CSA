public class FlowerBox {
    private Flower[] box;
    private int index;
    private int size;

    public FlowerBox(int s) {
        this.box = new Flower[s];
        this.index = 0;
        this.size = s;
    }

    public void pushFlower(Flower f) {
        if (index <= size - 1) {
            this.box[this.index] = f;
            this.index++;
        } else {
            System.out.println("Error: flower box is full.");
        }
    }

    public Flower popFlower(int i) {
        Flower f = this.box[i];
        this.box[i] = null;
        this.index--;
        return f;
    }

    public void printAll() {
        for (Flower f: box) {
            System.out.println(f.toString());
        }
    }
}
