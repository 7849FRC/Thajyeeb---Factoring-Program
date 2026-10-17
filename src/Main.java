public class Main {
    public static int factoring(int numeral) {

        int factorial = numeral;

        for (int i = numeral; i >= 1; i--) {

            if (i == 1) {

                break;

            }

            factorial = factorial * (i - 1);

        }

        return factorial;
    }

    public static void main(String[] args) {

        System.out.println(factoring(12));

    }
}