import java.util.List;
public class CountItemsMatchingRule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;
        int count = 0;
        for (List<String> item : items)
            if (item.get(index).equals(ruleValue)) count++;
        return count;
    }
    public static void main(String[] args) {
        List<List<String>> items = List.of(
            List.of("phone", "blue", "pixel"),
            List.of("computer", "silver", "lenovo"),
            List.of("phone", "gold", "iphone")
        );
        System.out.println(countMatches(items, "color", "silver"));
    }
}