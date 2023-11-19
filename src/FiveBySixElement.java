public class FiveBySixElement {
    public static void main(String[] args) {
        int [] [] array = {{0,1,2,3,4,5},{0,5,6,7,8,4},{0,3,5,6,7,8},{0,4,6,7,2,6},{0,2,5,7,9,1}
        };
        for(int col = 0;col < 6;col++){
            for(int row = 0;row < 5;row++){
                System.out.println(array[row][col]);
            }
        }
    }
}
