import java.util.Scanner;

public class StudentGradeCalculator {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        calculategrade();
    }

    private static void calculategrade() {
        System.out.print("Enter the total number of Subjects:- ");
        int numberofsubjects = scanner.nextInt();
        char grade = 0;
        int totalmarks = 0;
        for (int i = 1; i <= numberofsubjects; i++) {
            System.out.print("Enter the marks of Subject " + i + " :- ");
            int enteredmarks = scanner.nextInt();
            totalmarks += enteredmarks;
        }
        int wholeunitmarks = numberofsubjects * 100;
        double averageMarks = ((double) totalmarks / wholeunitmarks) * 100;
        if (averageMarks > 90) {
            grade = 'A';
        } else if (averageMarks >= 70 && averageMarks < 90) {
            grade = 'B';
        } else if (averageMarks >= 40 && averageMarks < 70) {
            grade = 'C';
        } else if (averageMarks < 40) {
            grade = 'F';
        }
        System.out.println("The Total Marks of the user is :- " + totalmarks);
        System.out.printf("The Average Percentage of Student is :- %.2f\n", averageMarks);
        System.out.println("The Grade Assign to the Student is :- " + grade);
    }
}