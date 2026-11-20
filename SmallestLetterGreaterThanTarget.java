public class SmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        for (char letter : letters) if (letter > target) return letter;
        return letters[0];
    }

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'j'));
    }
}