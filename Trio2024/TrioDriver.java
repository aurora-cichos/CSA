public class TrioDriver
   {
   public static void main( String args[] )
      {
      Sandwich sandwich = new Sandwich( "Cheeseburger", 10 );
      Salad salad = new Salad( "Spinach Salad" , 10 );
      Drink drink = new Drink( "Orange Soda", 15 );
          
      Trio trio = new Trio( sandwich, salad, drink );
      System.out.println( trio.getName() );
      System.out.println( trio.getPrice() );
      
      } // end method main
       
   } // end class TrioDriver
