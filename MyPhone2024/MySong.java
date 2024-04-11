public class MySong
   {
   // "The Big 3"    
   // 1. Instance Variables  
   private String title;
   private String artist;
   private double price;
   private int lengthInSecs;
   
   // 2. Constructor   
   public MySong( String initialTitle, String initialArtist, double initialPrice,
                int initialLengthInSecs )
     {
     title = initialTitle;
     artist = initialArtist;
     price = initialPrice;
     lengthInSecs = initialLengthInSecs;
     } // end three-argument constructor
   
   // Dynamic Duo - Getters and Setters
   public int getLengthInSecs()
      {
      return lengthInSecs;   
      } // end method getLengthInSec
   
   public void setLengthInSecs( int newLengthInSecs )
      {
      lengthInSecs = newLengthInSecs;   
      } // end method setLengthInSecs
      
   public double getPrice()
      {
      return price;   
      } // end method getPrice
     
   public void setPrice( double newPrice )
      {
      price = newPrice;   
      } // end method setPrice
   
   // The "Brain" method
   public String convertToMinSec()
      {
      int minutes = lengthInSecs / 60;
      int seconds = lengthInSecs % 60;
      
      return "The length of the song is: " + minutes + " minutes and " + seconds + "seconds.";
      } // end method convertToMinSec()
      
      
   // 3. toString()
   public String toString()
      {
      return "Artist is: " + artist + "\n" +
             "Title is: " + title + "\n" +
             "Price is: $ " + price + "\n" +
             "Length in seconds is: " + lengthInSecs + "\n";
          
      } // end method toString    
       
   } // end class MySong