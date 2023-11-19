import java.security.SecureRandom;
import java.util.Arrays;

public class DiceRolling {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(keepCountOf()));
    }
    public static int randomDiceRolling() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(1, 7);
    }

    public static int[] keepCountOf() {
        int[] numberOfIndex = new int[13];
        int sum = 0;
        for(int index = 0; index < 36000000; index++) {
            int firstRolling = randomDiceRolling();
            int secondRolling = randomDiceRolling();
            sum = firstRolling + secondRolling;
            numberOfIndex[sum]++;
        }
        return numberOfIndex;

    }

}
