public class Q20_DecimalToBinary {
    public static void main(String[] args) {
        int num = 25;
        int temp = num;
        String binary = "";

        if (temp == 0) {
            binary = "0";
        } else {
            while (temp > 0) {
                int remainder = temp % 2;
                binary = remainder + binary;
                temp = temp / 2;
            }
        }

        System.out.println("Binary: " + binary);
    }
}
