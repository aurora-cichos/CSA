public class Song {
    // instance variables
    private String title;
    private int streams; 
    private double songLength;
    private boolean isFavorited;

    /**
     * Constructor for objects of class Song
     * This is a default constructor
     */
    public Song() {
        // initialize instance variables
        title = "";
        streams = 0;
        songLength = 0.0;
        isFavorited = false;
    }

    /**
     * Constructor for objects of class Song
     * This has the parameters.
     * @param String title of Song
     * @param int streams
     * @param double songLength
     * @param boolean isFavorite
     */
    public Song(String title, int streams, double songLength, boolean isFavorited) {
        // initialize instance variables
        this.title = title;
        this.streams = streams;
        this.songLength = songLength;
        this.isFavorited = isFavorited;
    }

    /**
     * toString for Song object - includes info on all instance variables
     */
    public String toString() {
        // return a string that tells us about the Song
        return "Title: " + title + "\nStreams: " + streams + "\nSong Length: " + songLength + " seconds" + "\nFavorited: " + isFavorited;
    }
}
