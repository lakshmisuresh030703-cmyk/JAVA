import java.util.Arrays;
public class Main {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int difference = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++)
            if (arr[i] - arr[i - 1] != difference) return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(canMakeArithmeticProgression(new int[]{3, 5, 1}));
    }
}