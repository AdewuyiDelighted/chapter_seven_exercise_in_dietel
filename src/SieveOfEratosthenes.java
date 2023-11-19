import java.util.Arrays;

public class SieveOfEratosthenes {


    public static boolean[] convertAllElementTTrue() {
        boolean[] values = new boolean[1000];
        for (int index = 2; index < 1000; index++) {
            values[index] = true;
        }
        return values;
    }

    public static boolean[] sieve() {
        int count = 2;
        int product = 2;
        boolean[] convertToTrue = convertAllElementTTrue();
        for (int index = 0; index < convertToTrue.length; index++) {
            if (convertToTrue[count]) {
               int answer = product * count;
                if (answer < convertToTrue.length) {
                    convertToTrue[answer] = false;
                    product ++;
                } else {
                    count++;
                    product = 2;

                }
            }
        }
        return convertToTrue;

    }
}

