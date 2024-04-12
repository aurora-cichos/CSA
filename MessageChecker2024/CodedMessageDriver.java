public class CodedMessageDriver {
    public static void main(String[] args) {
        CodedMessageChecker mc1 = new CodedMessageChecker(5, 8, "!");
        String[] l1 = { "swell", "swell!", "taco", "swelltacos", "az!xy5!s" };
        for (String str: l1) {
            System.out.println(mc1.isValid(str));
        }

        CodedMessageChecker mc2 = new CodedMessageChecker("cat");
        String[] l2 = { "dogsAreCool", "catsAreCool", "tacos", "abcdefghijklmnopqrstuvwxyz", "concatenate" };
        for (String str: l2) {
            System.out.println(mc2.isValid(str));
        }
    }
}
