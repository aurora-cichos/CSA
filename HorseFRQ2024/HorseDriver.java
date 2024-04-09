public class HorseDriver
   {
   public static void main( String[] args )
      {
      HorseBarn home = new HorseBarn();
      
      System.out.print( home  + "\n" );
      
      String horseName = "Lady"; 
      System.out.println( horseName + " can be found in stall [" + home.findHorseSpace( horseName ) + "]\n" );
      
      home.consolidate();
      System.out.print( home + "\n" );
      } // end method main
   } // end class HorseDriver