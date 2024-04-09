public class SongDriver {
    public static void main(String[] args) {
        Song wakeUpSong = new Song();
        System.out.println(wakeUpSong.toString());

        Song goToSleepSong = new Song("Feel", 232544, 237.0, true);
        System.out.println(goToSleepSong.toString());
    }
}
