public class ArcheryGameMain {
    public static void main(String[] args) {
        int[][] scoreBoards = ArcheryGame.game();
        for (int index = 0; index < scoreBoards.length; index++) {
            System.out.printf("%s%8s", ArcheryGame.headings[index],"\t");
            for (int indices = 0; indices < scoreBoards[index].length; indices++) {
                System.out.print(scoreBoards[index][indices] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("The winner of the game is player " + ArcheryGame.winner(scoreBoards));
    }

}
