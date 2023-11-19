import java.util.*;

public class Polling {
    static String[] topics = {"Child abuse", "Unemployment", "Drug abuse", "Malnutrition", "Insecurity"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] responses = new int[5][12];
        String moreAns = "yes";

        while (moreAns.equals("yes")) {
            for (int index = 0; index < topics.length; index++) {
                System.out.println("Enter your rating from 1 to 10 on (1 as least important to 10 most important) " + topics[index] + " topics");
                int answer = scanner.nextInt();
                responses[index][answer]++;
            }
            System.out.println("If there are more user enter 'yes' or 'no' if there isn't ");
            moreAns = scanner.next().toLowerCase();
        }
        if (moreAns.equals("no")) {
            for (int count = 0; count < responses.length; count++) {
                System.out.printf("%s%8s", topics[count], "\t");
                for (int index = 1; index <= 10; index++) {
                    System.out.print(responses[count][index] + "\t");
                }
                System.out.println(" ");
            }
        }
        PollingFunctions.averageRating(responses);
        PollingFunctions.highestPoint(responses);
        PollingFunctions.lowestPoint(responses);

    }



}
