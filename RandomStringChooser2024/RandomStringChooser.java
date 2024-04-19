import java.lang.Math;
import java.util.ArrayList;

public class RandomStringChooser
{   
    private String[] wordList;
    private ArrayList<Integer> available;

    public RandomStringChooser(String[] wordList) {
        this.wordList = wordList;
        this.available = new ArrayList<Integer>();

        for (int i = 0; i < wordList.length; i++) {
            this.available.add(i);
        }
    }

    public String getNext() {
        if (available.size() == 0) {
            return "NONE";
        }
        int rand = (int) (Math.random() * available.size());
        return this.wordList[this.available.remove(rand)];
    }

    public String toString()
    {
        String output = new String();

        for( String word : wordList )
        {
            output += word + ", ";    
        } // end for

        return output;
    } // end method toString
} // end RandomStringChooser
