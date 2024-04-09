public class APLine
   {
   // 1. create the instance variables as specified by problem EXACTLY    
   // HINT - don't create instance variables that can be calculated from
   //    existing instance variables
   private int a;
   private int b;
   private int c;
   
   // 3. Make a constructor that has three integer parameters
   //    that represent a, b, and c, in that order.
   public APLine(int a, int b, int c) {
       this.a = a;
       this.b = b;
       this.c = c;
   }
   
   // 4. Make a method getSlope that calculates and returns the slope of the line  
   // HINT - cast a and/or b into a "double" for this calculation
   public double getSlope() {
       return (double) -a / b;
   }
   
   // 5. Make a method isOnLine that returns true if the point represented by its two parameters 
   //    (x and y, in that order) is on the APLine and returns false otherwise
   public boolean isOnLine(int x, int y) {
       if (a * x + b * y + c == 0) {
           return true;
       }
       return false;
   }

   } // end class APLine 