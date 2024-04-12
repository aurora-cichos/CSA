public class Sandwich implements MenuItem
   {
   private String name;
   private double price;
   
   public Sandwich( String initialName, double initialPrice )
      {
      name = initialName;
      price = initialPrice;
      } // end two-arg constructor
      
   public String getName()
      {
      return name;    
      } // end method getName
      
   public double getPrice()
      {
      return price;    
      } // end method getName
      
   } // end class Sandwich