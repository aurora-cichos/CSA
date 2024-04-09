import java.awt.Color;

public class MyPhone {
    private Color color;
    private double memoryCapacity;
    private Song[] songList = new Song[4];
    
    public MyPhone(Color color, double memoryCapacity) {
        this.color = color;
        this.memoryCapacity = memoryCapacity; 
        songList[0] = new Song("Here Comes The Sun", 1182593721, 184, false);
        songList[1] = new Song("Yesterday", 589581608, 125, false);
        songList[2] = new Song("Come Together", 687485916, 259, false);
        songList[3] = new Song("Let It Be", 636302309, 242, false);
    }
    
    public int totalPlayTime() {
        int sum = 0;
        for (Song song : songList) {
            sum += song.getSongLength();
        }
        return sum;
    }
    
    public void deleteAllSongs() {
        for (int i = 0; i < songList.length; i++) {
            songList[i] = null;
        }
    }
    
    public String toString() {
        String str = "MyPhone { Color: " + color + ", Memory Capacity: " + memoryCapacity + " Songs: ";
        for (Song song : songList) {
            str = str + song + ", "; 
        }
        str = str.substring(0, str.length() - 2) + " }";
        return str;
    }
}
