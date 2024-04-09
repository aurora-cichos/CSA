/**
 * Complete at least the first 4 methods below. Test them in the main method
 * Try the Challenges too!
 *
 * @author Ben Smith
 * @version (2/2021)
 */
public class ArrayAlgorithms
{
    /**
     * Average method to calculate an average
     * @ param int[] array of int values.
     * @return double average of int values in the array.
     */
    public static double average(int[] arr)
    { 
        double sum = 0;
        for( int num : arr )
        {
            sum+=num;
        }
        return sum/arr.length;
    }

    public static double minimum(double[] arr) {
        double min = arr[0];
        for (double num : arr) {
            if (num < min) min = num;
        }
        return min;
    }
    
     public static boolean findString(String[] words, String target) {
         for (String str : words) {
             if (str.equals(target)) return true;
         }
         return false;
     }
     
     public static PotatoHead[] hasMoustache(PotatoHead[] taters) {
         int length = 0;
         PotatoHead[] r;
         for (PotatoHead tater : taters) {
             if (tater.toString().substring(tater.toString().length() - 4).equals("true")) {
                 length++;
             }
         }
         
         r = new PotatoHead[length];
         
         for (int i = 0; i < taters.length; i++) {
             int count = 0;
             if (taters[i].toString().substring(taters[i].toString().length() - 4).equals("true")) {
                 r[count] = taters[i];
                 count++;
             }
         }
         return r;
     }
    
     public static String bigRect(Rectangle[] rects) {
         Rectangle max = rects[0];
         
         for (Rectangle rect : rects) {
             if (rect.area() > max.area()) max = rect;
         }
         return max.toString();
     }
     //      given an array of Rectangle objects, finds the one with the
     //     largest area, and returns the toString() for that rectangle.
     /* CHALLENGES: optional
     * public static boolean hasDuplicates(int[] arr)
     *      Determine the presence or absence of duplicate elements in an int[]
     * public static int numPotatoesWithArms(PotatoHead[] potatoes, int numArms)
     *      Determine the number of elements meeting specific criteria
     *      in this case, number of potatoheads in an array with a 
     *      specified number of arms.
     * public static void shiftLeft( int[] arr )
     *      Shift elements in an int[] to the left
     *      placing the elelment in index 0 to last index.
     *      alter the original array, do not return a new one.
     * public static void reverse( rectangle[] rects )
     *      Reverse the order of the elements in the array.
     */
    public static void main(String[] args)
    {
        // setup the arrays
        int[] nums = {1,6,8,3,4,2,3, 9, 13, 56};
        // double array
        double[] doubles = {1.2, 3.4, 6.7, 0.87, 3.14, 7.45};
        // String array
        String[] strings = {"cat", "dog", "name", "food", "word", "character"};
        // PotatoHead Array (at least 5 different PotatoHead objects)
        PotatoHead[] taters = {new PotatoHead("Bob", 203, "catch phrase", 1, true), new PotatoHead(), new PotatoHead(), new PotatoHead(), new PotatoHead()};
        // Rectangle Array (at least 5 different Rectangle objects)
        Rectangle[] rects = {new Rectangle(5, 5), new Rectangle(4, 3), new Rectangle (5, 3), new Rectangle(2, 2), new Rectangle(3, 4)};
        
        // call and test the methods: Be aware of their return methods (or not)
        System.out.println(" the average method: " + average( nums) );
        System.out.println("The minimum value in the list, doubles, is " + minimum(doubles));
        System.out.println("The list, strings, contains the word \"cat\"? " + findString(strings, "word"));
        System.out.print("The following potato heads have moustaches: ");
        for (PotatoHead pH : hasMoustache(taters)) {
            System.out.print(pH + ", ");
        }
        System.out.println();
        System.out.println("The biggest rectangle in rects is " + bigRect(rects));
        
        
        // CHALLENGES:
        // hasDuplicates(int[] arr)
        // numPotatoesWithArms(PotatoHead[] potatoes, int numArms)
        // shiftLeft( int[] arr )
        // reverse( rectangle[] rects )
    }

}
