public class Q35_DetectCapital {
    public static void main(String[] args) {
        String word = "USA";
        boolean valid = true;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (!Character.isUpperCase(ch)) {
                valid = false;
                break;
            }
        }

        if (valid) {
            System.out.println("Correct Capitalization");
        } else {
            System.out.println("Incorrect Capitalization");
        }
    }
}
