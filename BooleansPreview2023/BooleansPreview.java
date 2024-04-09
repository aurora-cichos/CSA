
/**
 * This is a preview of topics in Unit 3 on booleans and conditionals
 *
 * @author (Your Name)
 * @version (November 2020)
 */
public class BooleansPreview
{
  public static void main (String[] args)
  {
    //Using == vs .equals using Strings (and the concept of a String "pool")
    String name = new String("Ben");
    String name2 = new String("Ben");
    String name3 = "Ben";
    String name4 = "Ben";
    System.out.println(name == name2);
    System.out.println(name3 == name2);
    System.out.println(name3 == name4); //string "pool"
    System.out.println(name.equals(name2));
    System.out.println(name3.equals(name2));
    System.out.println(name3.equals(name4));
    // % challenges
    // Write a program that checks an int to see if it is Odd vs. Even
    int oddinator = 13;
    if (oddinator % 2 == 1) {
      System.out.println("odd");
    } else {
      System.out.println("even");
    }
    // Write a program to turn an int minutes into int hours and int minutes
    int minutes = 1357;
    int hours = minutes / 60;
    minutes = minutes % 60;
    System.out.println(hours + " hours and " + minutes + " minutes");
    
    // Write a program to remove the last digit of an int
    int removo = 1356;
    removo = removo / 10;
    System.out.println(removo);
    // If Statement programs:
    boolean isLit = false;
    // Write an if statement with one print command without {} on one line
    if (isLit) System.out.println("is lit");
    // Write an if statement with one print command with { } on multiple lines
    if (!isLit) {
      System.out.println("isn't lit");
    }

    // Write a block if statement with multiple lines
    // Write a program that generates a random number 
    // then checks if it is odd / even 
    // Then add positive / negative
    int rando = (int) (Math.random() * 3) - 1;

    if (rando % 2 == 0) {
      System.out.println("even");
    } else {
      System.out.println("odd");
    }

    if (rando > 0) {
      System.out.println("positive");
    } else if (rando < 0) {
      System.out.println("negative");
    } else {
      System.out.println("zero");
    }


    // Write an if / else - two way statement that prints one thing if
    // a random coin flip is heads and another if it is tails.
    boolean heads;


    //flip coin
    int r = (int) (Math.random() * 2);

    if (r == 0) {
      heads = true;
    } else {
      heads = false;
    }

    if(heads) {
      System.out.println("heads");
    }
    else {
      System.out.println("tails");
    }

    // Nested if and dangling else example: two if statements 
    // with a separate else.
    boolean isFancy = true;
    boolean hasIssues = true;

    if (isFancy) {
      System.out.print("fancy");
      if (hasIssues) {
        System.out.println(", but is bad");
      } else {
        System.out.println(" and is good");
      }
    } else {
      System.out.println("not fancy D:");
    }
    // finally - Multiple selection - else if statements based on 
    // the number of likes on a social media post:
    int numLikes = -1;
    if (numLikes < 0) {
      System.out.println("somehow your post has negative likes 0_0");
    }
    else if (numLikes == 0) {
      System.out.println("nobody seems to like your post :0");
    } else if (numLikes <= 10) {
      System.out.println("your post has a few likes :)");
    } else {
      System.out.println("wow, your post is getting a lot of likes!! :D");
    }
  }
}
