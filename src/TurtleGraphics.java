import java.util.Scanner;

public class TurtleGraphics {

    TurtleBoard turtleBoard =new TurtleBoard();
    TurtleDirection direction = TurtleDirection.EAST;

    TurtlePen turtlePen = TurtlePen.PEN_UP;

    TurtlePosition turtlePosition = new TurtlePosition();
    public void setTurtleBoard(){
        turtleBoard.setFloor(turtlePosition.getRow(), turtlePosition.getColumn());

    }
    public int[][] getTurtleBoard(){
        return turtleBoard.getFloor();

    }

    public void turnLeft() {
        if (getDirection() == TurtleDirection.EAST) {
            direction = TurtleDirection.NORTH;
        }
        if (getDirection() == TurtleDirection.NORTH) {
            direction = TurtleDirection.WEST;
        }
        if (getDirection() == TurtleDirection.WEST) {
            direction = TurtleDirection.SOUTH;
        }
        if (getDirection() == TurtleDirection.SOUTH) {
            direction = TurtleDirection.EAST;
        }
    }

    public void turnRight() {
        if (getDirection() == TurtleDirection.EAST) {
            direction = TurtleDirection.SOUTH;
        }
        if (getDirection() == TurtleDirection.SOUTH) {
            direction = TurtleDirection.WEST;
        }
        if (getDirection() == TurtleDirection.WEST) {
            direction = TurtleDirection.NORTH;
        }
        if (getDirection() == TurtleDirection.NORTH) {
            direction = TurtleDirection.EAST;
        }
    }
    public TurtleDirection getDirection() {
        return direction;
    }
    public  void movement(int input){
        int smallMove = 0;
        if(getDirection() == TurtleDirection.EAST){
           smallMove =  turtlePosition.getColumn() + input;
           turtlePosition.setColumn(smallMove);
        }
        if(getDirection() == TurtleDirection.SOUTH){
            smallMove =  turtlePosition.getRow() + input;
            turtlePosition.setRow(smallMove);
        }
        if(getDirection() == TurtleDirection.WEST){
            smallMove =  turtlePosition.getColumn() - input;
            turtlePosition.setColumn(smallMove);
        }
        if(getDirection() == TurtleDirection.NORTH){
            smallMove =  turtlePosition.getRow() - input;
            turtlePosition.setRow(smallMove);
        }

    }
    public void display(int input){
        Scanner scanner = new Scanner(System.in);
        switch (input){
            case 1 :{
                turtlePen = TurtlePen.PEN_UP;
            }
            case 2 : {
                turtlePen = TurtlePen.PEN_DOWN;
            }
            case 3 :{
               turnRight();
           }
            case 4 : {
                turnLeft();
            }
            case 5 :{
                System.out.println("Enter number of steps");
                int steps = scanner.nextInt();
                movement(steps);
                setTurtleBoard();
           }
            case 6:{
                for(int index = 0;index < getTurtleBoard().length;index++ ) {
                    for (int indices = 0; indices < getTurtleBoard()[index].length; indices++) {
                        if(getTurtleBoard()[index][indices] == 0){
                            continue;
                        }System.out.println(getTurtleBoard()[index][indices]);
                    }
                    System.out.println();
                }
            }
        }
    }


}
