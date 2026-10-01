public class Q29_AddBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int sum = num1 + num2;

        String result = Integer.toBinaryString(sum);

        System.out.println("Binary Sum = " + result);
    }
}
