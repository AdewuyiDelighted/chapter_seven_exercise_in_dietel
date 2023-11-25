import java.util.Scanner;

public class FibonacciSeriesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you would like to check if fibonacci");
        int fibonacciNumber = scanner.nextInt();
        System.out.println(FibonacciSeries.fibonacci(fibonacciNumber));
    }
}
