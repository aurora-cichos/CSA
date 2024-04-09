import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World world = new World(400,400);
    Turtle yertle = new Turtle(world);
    yertle.setColor(Color.red);

    for (int i = 0; i < 360; i++) {
      yertle.forward(10);
      yertle.turn(10);
    }

    world.setVisible(true);
  }
}
