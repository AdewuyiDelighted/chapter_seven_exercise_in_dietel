
public class PollingFunctions {
    public static void averageRating(int[][] responses) {
        int sum = 0;
        System.out.println();
        for (int index = 0; index < responses.length; index++) {
            for (int count = 0; count < responses[index].length; count++) {
                sum += responses[index][count];
            }
            System.out.printf("%s%s%s%d%n", "The average rating of ", Polling.topics[index], "\t", sum);
            sum = 0;
        }

    }

    private static int[] sum(int[][] responses) {
        int sum = 0;
        int[] holdSum = new int[responses.length];
        for (int index = 0; index < responses.length; index++) {
            for (int count = 0; count < responses[index].length; count++) {
                sum += responses[index][count];
            }
            holdSum[index] = sum;
            sum = 0;
        }
        return holdSum;
    }

    public static void highestPoint(int[][] response) {
        int[] sumOfRow = sum(response);
        int indexOfTopic = 0;
        int maxi = 0;
        for (int index = 0; index < sumOfRow.length; index++) {
            maxi = sumOfRow[0];
            if (sumOfRow[index] > maxi) {
                maxi = sumOfRow[index];
                indexOfTopic = index;
            }
        }
        System.out.println("The issue is highest point is " + Polling.topics[indexOfTopic] + " with point " + maxi);
    }
    public static void lowestPoint(int[][] response) {
        int[] sumOfRow = sum(response);
        int indexOfTopic = 0;
        int mini = 0;
        for (int index = 0; index < sumOfRow.length; index++) {
            mini = sumOfRow[0];
            if (sumOfRow[index] < mini) {
                mini = sumOfRow[index];
                indexOfTopic = index;
            }
        }
        System.out.println("The issue is lowest point is " + Polling.topics[indexOfTopic] + " with point " + mini);
    }
}
