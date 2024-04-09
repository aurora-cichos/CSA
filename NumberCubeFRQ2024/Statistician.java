import java.util.Arrays;

public class Statistician
{
  // Part (a)

  /** Returns an array of the values obtained by tossing a number cube numTosses times.
   *  @param cube a NumberCube
   *  @param numTosses the number of tosses to be recorded
   *         Precondition: numTosses > 0
   *  @return an array of numTosses values
   */
  public static int[] getCubeTosses(NumberCube cube, int numTosses)
  {
    int[] cubeTosses = new int[numTosses];
    for (int i = 0; i < cubeTosses.length; i++) {
        cubeTosses[i] = cube.toss();
    }
    return cubeTosses;
  }

  // *************************************************

  // Part (b)

  /** Returns the starting index of a longest run of two or more consecutive repeated values
   *  in the array values.
   *  @param values an array of integer values representing a series of number cube tosses
   *         Precondition: values.length > 0
   *  @return the starting index of a run of maximum size;
   *          -1 if there is no run
   */
  public static int getLongestRun(int[] values)
  {
    int maxRun = 0, currentRun = 0;
    int maxIndex = -1;
    for (int i = 1; i < values.length; i++) {
        if (values[i] == values[i - 1]) {
            currentRun++;
            if (currentRun > maxRun) {
                maxRun = currentRun;
                maxIndex = i - currentRun;
            }
        } else {
            currentRun = 0;
        }
    }
    return maxIndex;
  }

  // *************************************************

  public static void main(String[] args)
  {
    NumberCube cube = new NumberCube();
    for (int count = 1; count < 10; count++)
    {
      int[] values = getCubeTosses(cube, 18);
      int maxRunStart = getLongestRun(values);
      System.out.println(Arrays.toString(values) + " ==> " + maxRunStart);
    }
  }
}
