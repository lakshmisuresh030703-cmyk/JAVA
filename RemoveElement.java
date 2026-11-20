import java.util.Arrays;

public class Main {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int num : nums) {
            if (num != val) nums[index++] = num;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int length = removeElement(nums, 3);
        System.out.println("Length: " + length);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, length)));
    }
}