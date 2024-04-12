public class MessageChecker {
    private int minLength;
    private int maxLength;

    public MessageChecker(int min, int max) {
        minLength = min;
        maxLength = max;
    }

    public boolean isValid(String str) {
        return str.length() >= minLength && str.length() <= maxLength;
    }
}
