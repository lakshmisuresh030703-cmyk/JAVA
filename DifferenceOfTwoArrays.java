import java.util.*;

public class DifferenceOfTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums1) set1.add(n);
        for (int n : nums2) set2.add(n);
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        for (int n : set1) if (!set2.contains(n)) first.add(n);
        for (int n : set2) if (!set1.contains(n)) second.add(n);
        return Arrays.asList(first, second);
    }

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}));
    }
}