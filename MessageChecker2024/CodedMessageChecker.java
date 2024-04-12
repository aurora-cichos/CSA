public class CodedMessageChecker extends MessageChecker {
    private String notStr;

    public CodedMessageChecker(int min, int max, String nS) {
        super(min, max);
        notStr = nS;
    }
    public CodedMessageChecker(String nS) {
        super(6, 20);
        notStr = nS;
    }

    @Override
    public boolean isValid(String str) {
        if (!super.isValid(str)) {
            return false;
        }

        return str.indexOf(notStr) == -1;
    }
}
