public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int total = 0, left = 0;
        for (int num : nums) total += num;
        for (int i = 0; i < nums.length; i++) {
            if (left == total - left - nums[i]) return i;
            left += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
}