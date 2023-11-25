import java.security.SecureRandom;

public class ArcheryGame {

    static int[][] scoreBoard = new int[5][4];
    static String[] headings = {"Player ID","First Score","Second Score","Third Score","Total Score"};

    public static int generateScore() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(0, 11);
    }

    public static int[] playerId() {
        int[] playerId = new int[4];
        for (int index = 0; index < 4; index++) {
            playerId[index] = index + 1;
        }
        return playerId;
    }

    public static int[][] game() {
        int[] playerId = playerId();
        for (int row = 1; row < 5; row++) {
            scoreBoard[0][row - 1] = playerId[row - 1];
            for (int column = 0; column < scoreBoard[row].length; column++) {
                scoreBoard[row][column] = generateScore();
            }
        }
        sumPlayerScores(scoreBoard);
        return scoreBoard;
    }

    public static int[][] sumPlayerScores(int[][] board) {
        int[] sum = new int[4];
        int count = 0;
        for (int index = 0; index < board.length - 1; index++) {
            for (int indices = 1; indices < board[index].length; indices++) {
                count += board[indices][index];
            }
            sum[index] = count;
            count = 0;
        }
        return lastRowElements(board, sum);
    }

    private static int[][] lastRowElements(int[][] board, int[] sum) {
        for (int index = 0; index < board.length - 1; index++) {
            board[board.length - 1][index] = sum[index];
        }
        return board;
    }
    public static int winner(int[][] scoreBoard){
        int lengthOfLastRow = scoreBoard.length-1;
        int max = scoreBoard[lengthOfLastRow][0];
        int indexOfWinner = 1;
        for(int index = 0; index < scoreBoard[lengthOfLastRow].length; index++) {
            if (scoreBoard[lengthOfLastRow][index] > max ) {
                max = scoreBoard[lengthOfLastRow][index];
                indexOfWinner = index +1;
            }
        }
        return indexOfWinner;
    }


}
