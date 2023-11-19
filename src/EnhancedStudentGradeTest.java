import java.util.Arrays;
import java.util.Scanner;

public class EnhancedStudentGradeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of student that partake in the course");
        int numberOfStudents = scanner.nextInt();
        System.out.println("Enter the number of exams that all the student partake in");
        int numberOfExam = scanner.nextInt();

        EnhancedStudentGrade enhancedStudentGrade = new EnhancedStudentGrade("Business Admin", 2, 3);
        String courseName = enhancedStudentGrade.getCourseName();
        int[][] studentGrade = enhancedStudentGrade.setGrade(numberOfStudents, numberOfExam);
        System.out.print("The" +
                "" +
                "  Course name is " + courseName + "\n" + "The score below are students score");

        System.out.println(Arrays.deepToString(studentGrade));

    }
}
