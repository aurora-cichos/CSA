import java.util.*;
/**
In Main2, write the following methods to work with ArrayList<String>
1.  Linear search: linearSearch(ArrayList<String>)
2.  Binary search: binarySearch(ArrayList<String>)
3.  Insertion sort: insertionSort(ArrayList<String>)
4.  Selection sort: selectionSort(ArrayList<String>)
*/
public class Main2 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("be"); words.add("full"); words.add("country");
        words.add("ask"); words.add("egg");
        words.add("go"); words.add("dog");

        printList(words);
        System.out.println(linearSearch(words, "cat"));
        System.out.println(linearSearch(words, "egg"));

        insertionSort(words);

        printList(words);
        System.out.println(linearSearch(words, "cat"));
        System.out.println(linearSearch(words, "egg"));

        words = new ArrayList<String>();
        words.add("be"); words.add("full"); words.add("country");
        words.add("ask"); words.add("egg");
        words.add("go"); words.add("dog");

        printList(words);
        System.out.println(binarySearch(words, "cat"));
        System.out.println(binarySearch(words, "egg"));

        selectionSort(words);

        printList(words);
        System.out.println(binarySearch(words, "cat"));
        System.out.println(binarySearch(words, "egg"));
    }

    public static int linearSearch(ArrayList<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<String> list, String target) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target.compareTo(list.get(middle)) < 0) {
                right = middle - 1;
            } else if (target.compareTo(list.get(middle)) > 0) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
    
    public static void insertionSort(ArrayList<String> list) {
        for (int i = 1; i < list.size(); i++) {
            String temp = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j).compareTo(temp) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, temp);
        }
    }

    public static void selectionSort(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareTo(list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                String temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }

    public static void printList(ArrayList<String> list) {
        System.out.println(list.toString());
    }
}
