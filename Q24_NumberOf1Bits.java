public class Q24_NumberOf1Bits {
    public static void main(String[] args) {
        int num = 29;
        int count = 0;

        while (num != 0) {
            int bit = num % 2;

            if (bit == 1) {
                count++;
            }

            num = num / 2;
        }

        System.out.println("Number of 1 Bits = " + count);
    }
}
