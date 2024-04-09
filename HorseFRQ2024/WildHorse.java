public class WildHorse implements Horse
   {
   private String name;
   private int weight;
   
   public WildHorse()
      {
      name = null;
      weight = 0;
      } 
        
   public WildHorse( String initialName, int initialWeight )
      {
      name = initialName;
      weight = initialWeight;
      }
      
   public String getName()
      {
      return name;    
      } // end method getName()
      
   public int getWeight()
      {
      return weight;    
      }  // end method getWeight()
      
   public String toString()
      {
      return "My name is: " + getName() + " and my weight is: " + getWeight();    
      } // end method toString()
   } // end class RaceHorse