public class Main {
    public static void main(String[] args) {

        int income = 300000;

        if (income > 1000000) {
            System.out.println("He is Rich");
        }
        else if (income <= 1000000 && income > 500000) {
            System.out.println("He is Middle Class");
        }
        else if (income <= 500000 && income > 200000) {
            System.out.println("He is Lower Middle");
        }
        else {
            System.out.println("He is Poor");
        }
    }
}
