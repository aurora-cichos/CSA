/**
 * GeometricTurtle.java
 *
 * A turtle that also knows how to draw some simple shapes
 *
 * @author Kathryn Lenth, Westminster College (klenth@westminstercollege.edu)
 */
class GeometricTurtle extends Turtle {

  /**
   * Constructor that takes a model display and adds
   * a turtle in the middle of it
   * @param display the model display
   */
   public GeometricTurtle(ModelDisplay display) {
      super(display);
   }
   
   /**
    * Draws a polygon with a specified size and number of sides.
    * @param size the size of the polygon to draw
    * @param numSides how many sides (must be at least 1)
    * @throws java.lang.IllegalArgumentException if numSides &lt; 1
    */
   public void drawPolygon(int size, int numSides) {
      if (numSides < 1)
         throw new IllegalArgumentException("numSides must be at least 1");
      
      // Length of each side of the polygon   
      int length = (int)Math.round(20 * size * Math.sin(Math.PI / numSides));
      // Angle to turn between sides
      double angle = 360.0 / numSides;
      
      this.turn(angle / 2 - 90);
      
      for (int i = 0; i < numSides; ++i) {
         this.forward(length);
         this.turn(angle);
      }
      
      this.turn(90 - angle / 2);
   }
   
   /**
    * Draws a circle with the given size.
    * @param size the size of the circle to draw
    */
   public void drawCircle(int size) {
      this.drawPolygon(size, 100);
   }
   
   /**
    * Returns a String representation of this turtle
    */
   @Override
   public String toString() {
      return super.getName() + " geometric turtle at " +
            super.getXPos() + ", " + super.getYPos() + 
            " heading " + super.getHeading() + ".";
   }
}
