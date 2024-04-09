public class HorseBarn
   {
   private Horse[] spaces;
   
   public HorseBarn()
      {
      spaces = new Horse[7];
      spaces[0] = new RaceHorse( "Trigger", 1340 );
      spaces[1] = null;
      spaces[2] = new WildHorse( "Silver", 1210 );
      spaces[3] = new RaceHorse( "Lady", 1575 );
      spaces[4] = null;
      spaces[5] = new WildHorse( "Patches", 1350 );
      spaces[6] = new RaceHorse( "Duke", 1410 );
      } // end zero-arg constructor HorseBarn()
        
        
   public int findHorseSpace(String name)
    {
          for (int i = 0; i < spaces.length; i++)
          {
              if (spaces[i] != null && name.equals(spaces[i].getName())) {
                  return i;
              }
          }
          return -1;
      } // end method findHorseSpace
      
   public void consolidate()
    {
        int i = 0;
        for (int j = 0; j < spaces.length; j++)
        {
            if (spaces[j] != null)
            {
                spaces[i] = spaces[j];
                if (i != j) spaces[j] = null;
                i++;
            }
        }
    } // end method consolidate
      
   public String toString()
      {
      String results = new String();
      for( int index = 0; index < spaces.length; index++ )
         {
         results += spaces[index] + "\n";     
         } // end for
      return results;
      }
      
      
   } // end class HorseBarn