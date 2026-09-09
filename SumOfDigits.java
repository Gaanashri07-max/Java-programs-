public class SumOfDigits {
    public static void main(String[] args) {

        int[] digits = {7, 5, 8, 4};
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum = sum + digits[i];
        }

        System.out.println("Sum of digits = " + sum);
    }
}