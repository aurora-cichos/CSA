public class Driver
   {
   public static void main( String args[] )
      {
      MyPhone phone = new MyPhone( "Space Grey", 32 );
      System.out.println( phone ); 
      phone.deleteAllSongs();
      System.out.println( "Printing after deleting songs" );
      System.out.println( phone ); 
      } // end method main
   } // end MyPhoneDriver
