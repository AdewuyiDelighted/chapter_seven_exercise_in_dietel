import java.security.SecureRandom;
import java.util.Arrays;

public class TortoiseAndHare {
    static String[] squares = new String[70];
    static int indexForTortoise = 0;
    static int indexForHare = 0;

    private static int numberGenerator() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(1, 11);
    }

    public static void squareMove() {
        for (int clock = 0; clock < squares.length; clock++) {
            int tortoiseRandomNum = numberGenerator();
            indexForTortoise = tortoiseMove(tortoiseRandomNum);
            int hareRandomNum = numberGenerator();
            indexForHare = hareMove(hareRandomNum);

            if (tie()) break;
            if (tortoiseBiteHare(tortoiseRandomNum, hareRandomNum)) ;

            if (indexForTortoise <= 69 && indexForTortoise >= 0) {
                squares[indexForTortoise] = "T";
                if (tortoiseWins()) break;
            }
            if (indexForHare <= 69 && indexForHare >= 0) {
                squares[indexForHare] = "H";
                if (hareWins()) break;

            }
            System.out.println(Arrays.toString(squares));
        }
        noAnimalWin();
        System.out.println(Arrays.toString(squares));
    }


    private static boolean tortoiseWins() {
        if (indexForTortoise == 69) {
            System.out.println("TORTOISE WINS !!! YAY");
            return true;
        }
        return false;
    }

    private static boolean hareWins() {
        if (indexForHare == 69) {
            System.out.println("HARE WINS HURRAY");
            return true;
        }
        return false;
    }

    private static boolean noAnimalWin() {
        if (indexForHare != 69 && indexForTortoise != 69) {
            System.out.println("No winner play again");
            return true;
        }
        return false;
    }

    private static boolean tie() {
        if (indexForHare == 69 && indexForTortoise == 69 ) {
            System.out.println("It's a tie");
            return true;
        }
        return false;
    }

    private static boolean tortoiseBiteHare(int tortoiseRandomNum, int hareRandomNum) {
        if (tortoiseRandomNum == hareRandomNum) {
            System.out.println("OUCH");
            return true;
        }
        return false;

    }


    public static int tortoiseMove(int number) {
        if (number >= 1 && number <= 5) {
            indexForTortoise += 3;
        } else if (number >= 6 && number <= 7) {
            indexForTortoise -= 6;
        }
        if (number >= 8 && number <= 10) {
            indexForTortoise += 1;
        }
        return indexForTortoise;
    }

    public static int hareMove(int number) {
        if (number >= 1 && number <= 2) {
            indexForHare = 0;
        }
        if (number >= 3 && number <= 4) {
            indexForHare += 9;
        }
        if (number == 5) {
            indexForHare -= 12;
        }
        if (number >= 6 && number <= 8) {
            indexForHare += 1;
        }
        if (number >= 9 && number <= 10) {
            indexForHare -= 2;
        }
        return indexForHare;
    }

}
