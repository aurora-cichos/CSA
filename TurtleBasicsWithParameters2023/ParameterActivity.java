import java.awt.Color;

public class ParameterActivity {

   public static void main(String[] args) {
      // Variable declarations
      World window;
      GeometricTurtle george;
      GeometricTurtle gracie;
      
      // Variable initialization
      window = new World();
      george = new GeometricTurtle(window);
      gracie = new GeometricTurtle(window);
      gracie.setColor(Color.blue);   // Gracie is blue
      george.setColor(Color.red);    // George is red
      
      // Move Gracie away from George so that we can see them both
      gracie.penUp();
      gracie.backward(100);
      gracie.penDown();
      
      // === Put your code here ===
      
      
      
   }
}
