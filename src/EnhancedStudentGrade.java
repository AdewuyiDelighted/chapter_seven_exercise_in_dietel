import java.util.Scanner;

public class EnhancedStudentGrade {
    private String courseName;
    private int numberOfStudent;
    private int numberOfExams;


    public EnhancedStudentGrade(String courseName, int numberOfStudent, int numberOfExams) {
        this.courseName = courseName;
        this.numberOfStudent = numberOfStudent;
        this.numberOfExams = numberOfExams;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public int[][] createStudentScoreBoard(int numberOfStudent, int numberOfExams) {
        int[][] scoreBoard = new int[numberOfStudent][numberOfExams];
        return scoreBoard;
    }

    public void outputGrade() {
        int[][] collectScoreBoard = createStudentScoreBoard(numberOfStudent, numberOfExams);
        System.out.println("The grades are :%n%n");
        for (int student = 0; student < numberOfStudent; student++) {
            System.out.printf("Student %2d: %3d%n", student + 1, collectScoreBoard[student]);
        }

    }

    public int[][] setGradesToInitialScore() {
        int[][] collectScoreBoard = createStudentScoreBoard(numberOfStudent, numberOfExams);
        for (int count = 0; count < collectScoreBoard.length; count++) {
            for (int index = 0; index < collectScoreBoard[count].length; index++) {
                collectScoreBoard[count][index] = -1;
            }
        }
        return collectScoreBoard;
    }

    public int[][] setGrade(int numberOfStudent, int numberOfExams) {
        int[][] collectScoreBoard = createStudentScoreBoard(numberOfStudent, numberOfExams);
        setGradesToInitialScore();
        Scanner scanner = new Scanner(System.in);
        for (int student = 0; student < collectScoreBoard.length; student++) {
            for (int exams = 0; exams < collectScoreBoard[student].length; exams++) {
                System.out.printf("Enter the score of Student %d exam %d", student + 1, exams + 1);
                int score = scanner.nextInt();
                collectScoreBoard[student][exams] = score;
            }
        }
        return collectScoreBoard;
    }
}