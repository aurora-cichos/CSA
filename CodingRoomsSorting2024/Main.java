import java.util.*;
// no worries!

public class Main {

    public static void main(String[] args) {
        
        int[] nums = {15,13,17,14,19,12,16};
        String[] letters = {"b", "f", "c", "a", "e", "g", "d"};

        printList(nums);
        selectionSortInts(nums);
        printList(nums);
        printList(letters);
        insertionSortStrings(letters);
        printList(letters);
        
        int index = binarySearchInts(nums, 17);
        System.out.println(index); //cool.
        
        index = linearSearchInts(nums, 17);
        System.out.println(index);

        index = binarySearchStrings(letters, "e");
        System.out.println(index);

        index = linearSearchStrings(letters, "e");
        System.out.println(index);

    }

    public static int linearSearchInts(int[] list, int target){
        int pos = -1;
        for (int i = 0; i < list.length; i++ )
            if (list[i] == target)
                return i;

        return pos;
    }

    public static int linearSearchStrings(String[] list, String target){
        int pos = -1;
        for (int i = 0; i < list.length; i++ )
            if (list[i].equals(target)) // why .equals?
                return i;

        return pos;
    }
    
    public static int binarySearchInts(int[] list, int target) {
        int left = 0;
        int right = list.length - 1;
        while (left <= right) 
        {
            int middle = (left + right) / 2;
            if (target < list[middle])
            {
            right = middle - 1;
            } else if (target > list[middle]) 
            {
                left = middle + 1;
            }
            else
            {
                return middle;
            }
        }
        return -1;
    }
    
    public static int binarySearchStrings(String[] list, String target) {
        // complete this method for String[] 
        int left = 0;
        int right = list.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target.compareTo(list[middle]) < 0) {
                right = middle - 1;
            } else if (target.compareTo(list[middle]) > 0) {
                left = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

    public static void selectionSortInts(int[] list)
    {
        for (int j = 0; j < list.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < list.length; k++)
            {
                if (list[k] < list[minIndex])
                {
                    minIndex = k;
                }
            }
            int temp = list[j];  // 3 way swap, extra hand swap
            list[j] = list[minIndex];
            list[minIndex] = temp;
        }
    }

   public static void selectionSortStrings(String[] list)
   {
        for (int j = 0; j < list.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < list.length; k++)
            {
                if (list[k].compareTo(list[minIndex]) < 0)
                {
                    minIndex = k;
                }
            }
            String temp = list[j];  // 3 way swap, extra hand swap
            list[j] = list[minIndex];
            list[minIndex] = temp;
        }
   }

   public static void insertionSortInts(int[] list)
   {
      for (int i = 1; i < list.length; i++)
      {
         int temp = list[i];  // extra hand
         int j = i;
         while (j > 0 && temp < list[j - 1])
         {
            list[j] = list[j - 1];  // slide to the right
            j--;
         }
         list[j] = temp;  // extra hand put back
      }
    }


    public static void insertionSortStrings(String[] list) 
    {
        for (int i = 1; i < list.length; i++)
        {
            String temp = list[i];
            int j = i;
            while (j > 0 && temp.compareTo(list[j-1]) < 0)
            {
                list[j] = list[j-1];
                j--;
            }
            list[j] = temp;
        }
    }
    
    // ****** No need to change these

    private static void printList(int[] list){
        Integer[] newArray = new Integer[list.length];
        int i = 0;
        for (int value : list) 
            newArray[i++] = Integer.valueOf(value);

        printList(newArray);
        
    }

    private static void printList(Object[] list){
        String output = "{ ";
        for (int i = 0; i < list.length-1; i++){
            output += list[i] + ", ";
        }
        if ( list.length > 0) output += list[list.length-1];
        output +=  " }";

        System.out.println( output );
    }

}
