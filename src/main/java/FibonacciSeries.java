public class FibonacciSeries {

    public static void main(String[] args) {

        int firstNumber = 1;

        int secondNumber = 1;

        int sum =0;

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        while (sum<100) {
            sum = firstNumber+secondNumber;
            System.out.println(sum);
            firstNumber = secondNumber;
            secondNumber = sum;
        }
    }
}
