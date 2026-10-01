public class Q28_CountDigits {
    public static void main(String[] args) {
        int num = 1248;
        int temp = num;
        int count = 0;

        while (temp != 0) {
            int digit = temp % 10;

            if (digit != 0 && num % digit == 0) {
                count++;
            }

            temp = temp / 10;
        }

        System.out.println("Count = " + count);
    }
}
