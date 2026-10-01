public class Q37_StringArraysEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        String str1 = "";
        String str2 = "";

        for (int i = 0; i < word1.length; i++) {
            str1 = str1 + word1[i];
        }

        for (int i = 0; i < word2.length; i++) {
            str2 = str2 + word2[i];
        }

        if (str1.equals(str2)) {
            System.out.println("String Arrays are Equivalent");
        } else {
            System.out.println("String Arrays are Not Equivalent");
        }
    }
}
