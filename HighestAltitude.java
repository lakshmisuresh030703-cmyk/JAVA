public class HighestAltitude {
    public static int largestAltitude(int[] gain) {
        int current = 0, max = 0;
        for (int value : gain) {
            current += value;
            if (current > max) max = current;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    }
}