public class TurtleBoard {
    private  int[][] floor = new int[20][20];

    public int[][] getFloor() {
        return floor;
    }

    public void setFloor(int row,int coloumn) {
        this.floor[row][coloumn] = 1;
    }
}
