public class LabelArrayTable {
    public static void main(String[] args) {

        int[][] table = new int[5][6];
        for (int colum = 0; colum < 6; colum++) {
            System.out.println("colum " + (colum+1));
            for(int row = 0; row < 5;row++){
                System.out.println(table[row][colum] = 0);
            }

        }

    }
}
