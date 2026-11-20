public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int money : account) wealth += money;
            if (wealth > maxWealth) maxWealth = wealth;
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}, {2, 8, 7}};
        System.out.println(maximumWealth(accounts));
    }
}