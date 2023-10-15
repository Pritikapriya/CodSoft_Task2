import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSubjects;
        double totalMarks = 0;

        System.out.print("Enter the total number of subjects: ");
        totalSubjects = scanner.nextInt();

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
                return;
            }
            totalMarks += marks;
        }

        double averagePercentage = (totalMarks / (totalSubjects * 100)) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");

        
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}