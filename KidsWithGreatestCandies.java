import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) if (candy > max) max = candy;
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) result.add(candy + extraCandies >= max);
        return result;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        System.out.println(kidsWithCandies(candies, 3));
    }
}