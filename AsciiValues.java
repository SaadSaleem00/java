public class AsciiValues {
    public static void main(String[] args) {
        char[] chars = {'A', 'b', 'C', 'z'};

        for (char ch : chars) {
            System.out.println("ASCII of '" + ch + "' = " + (int) ch);
        }
    }
}
