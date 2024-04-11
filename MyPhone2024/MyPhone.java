

import java.util.ArrayList; // Import statement for ArrayList

public class MyPhone extends Device {
    private String color;
    private int memory;
    private ArrayList<MySong> songs; // Use ArrayList instead of array
    
    public MyPhone(String c, int m) {
        super(c,m);
        songs = new ArrayList<MySong>(); // Initialize ArrayList
        songs.add(new MySong("I Zimbra", "Talking Heads", 0.99, 124));
        songs.add(new MySong("Psycho Killer", "Talking Heads", 1.99, 300));
        songs.add(new MySong("Life During Wartime", "Talking Heads", 0.99, 212));
        songs.add(new MySong("Burning Down the House", "Talking Heads", 0.99, 124));
    }

    public int totalPlayTime() {
        int total = 0;
        for (MySong song : songs) { // Enhanced for loop works directly with ArrayList
            total += song.getLengthInSecs();
        }
        return total;
    }

    public void deleteAllSongs() {
        for(int i = 0 ; i < songs.size() ; i++)
        {
            songs.remove(i);
            i--; //ArrayList Removal Problem
        }
    }

    
    public String toString() {
        String output = "The Phone:\n";
    
        output += super.toString() + "\n";
        for (MySong song : songs) {
            output += "\n" + song.toString() + "\n";
        }
        return output;
    }
} // end class MyPhone
