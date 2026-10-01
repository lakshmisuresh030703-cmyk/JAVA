public class Q36_ReversePrefix {
    public static void main(String[] args) {
        String word = "abcdef";
        char ch = 'd';

        int index = word.indexOf(ch);

        if (index != -1) {
            String prefix = word.substring(0, index + 1);
            String suffix = word.substring(index + 1);
            String reverse = "";

            for (int i = prefix.length() - 1; i >= 0; i--) {
                reverse = reverse + prefix.charAt(i);
            }

            word = reverse + suffix;
        }

        System.out.println("Result = " + word);
    }
}
