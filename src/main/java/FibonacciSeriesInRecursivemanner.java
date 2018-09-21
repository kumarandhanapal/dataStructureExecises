public class FibonacciSeriesInRecursivemanner {

public static void main(String[] args) {

    System.out.println("1");
    System.out.println("1");
    System.out.println(fib(100));


}

public static int fib(int n) {
    if (n<2) {
        return n;
    }

    return fib(n-1)+fib(n-2);
}


}

