import java.util.Scanner;

public class TurtleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TurtleGraphics turtleGraphics =  new TurtleGraphics();
        System.out.println("Enter a int of command");
        int input = scanner.nextInt();
        while (input != 6){
            turtleGraphics.display(input);
        }

    }
}

