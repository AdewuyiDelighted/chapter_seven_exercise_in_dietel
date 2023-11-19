import java.util.ArrayList;

public class FibonacciSeries {

    public static ArrayList<Integer> fibonacci(int number) {
        ArrayList<Integer> addFibonacci = new ArrayList<>();
        int firstNum = 0;
        int secondNum = 1;
        int sum = 0;
        addFibonacci.add(firstNum);
        for (int index = 0; index < number; index++) {
            sum = firstNum + secondNum;
            addFibonacci.add(sum);
            secondNum = firstNum;
            firstNum = sum;
        }
        return addFibonacci;
    }
    public static ArrayList<Double> fibonacci(double number) {
        ArrayList<Double> addFibonacci = new ArrayList<>();
        double firstNum = 0;
        double secondNum = 1;
        double sum = 0;
        addFibonacci.add(firstNum);
        for (int index = 0; index < number; index++) {
            sum = firstNum + secondNum;
            addFibonacci.add(sum);
            secondNum = firstNum;
            firstNum = sum;
        }
        return addFibonacci;
    }

}
