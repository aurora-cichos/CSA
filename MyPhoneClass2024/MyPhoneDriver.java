import java.awt.Color;

public class MyPhoneDriver {
    public static void main(String[] args) {
        MyPhone phone = new MyPhone(Color.red, 4);
        System.out.println(phone);
        System.out.println("Total Play Time " + phone.totalPlayTime());
        phone.deleteAllSongs();
        System.out.println(phone);
    }
}