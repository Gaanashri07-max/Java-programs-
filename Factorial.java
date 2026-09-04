public class Factorial {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            int fact = 1;
            int j = 1;

            while (j <= i) {
                fact = fact * j;
                j++;
            }

            System.out.println("Factorial of " + i + " = " + fact);
            i++;
        }
    }
}