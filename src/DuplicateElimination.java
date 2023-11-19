import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(collectInput()));
    }

    public static int[] convertAllElementToMinusOne() {
        int[] array = new int[10];
        Arrays.fill(array, -1);
        return array;

    }

    public static int[] collectInput() {

        int[] array = new int[10];
        int input = 0;
        boolean condition = true;
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < 10; index++) {
            while (condition) {
                try {
                    System.out.println("Enter a number");
                    input = scanner.nextInt();
                    if (input > 100 || input < 0) {
                        condition = false;
                        throw new IllegalArgumentException("Invalid input");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return array;

    }
}