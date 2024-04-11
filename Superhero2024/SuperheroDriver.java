import java.util.ArrayList;

public class SuperheroDriver
   {
   public static void main( String[] args )
      {
      Superhero hero = new Superhero( "Heroman" ); 
      // add objects of superhero subclasses
      System.out.println( hero.getMotto() );
      // print mottoes and other methods.
      ArrayList<Superhero> heroes = new ArrayList<Superhero>();
      heroes.add(hero);
      //add other objects polymorphically
      heroes.add(new FireHero("Jeff", 300));
      heroes.add(new IceHero("Bob", 20));
      heroes.add(new SpeedHero("Jeff2"));
      
      // use a for or for each loop to run all methods.
      for (Superhero s: heroes) {
            System.out.println(s.getMotto());
        }
      } // end method main
   } // end SuperheroDriver
