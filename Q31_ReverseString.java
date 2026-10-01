public class Q31_ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        char[] chars = str.toCharArray();

        System.out.print("Reversed String = ");

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
