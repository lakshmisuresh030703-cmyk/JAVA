public class Q11_Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] count = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        boolean anagram = true;

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                anagram = false;
                break;
            }
        }

        if (anagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
