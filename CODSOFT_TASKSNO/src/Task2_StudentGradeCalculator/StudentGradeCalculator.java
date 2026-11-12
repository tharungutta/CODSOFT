package Task2_StudentGradeCalculator;

import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        if (subjects <= 0) {
            System.out.println("Invalid number of subjects.");
            sc.close();
            return;
        }

        int total = 0;

        for (int i = 1; i <= subjects; i++) {

            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Enter marks between 0 and 100.");
                i--;
                continue;
            }

            total += marks;
        }

        double average = (double) total / subjects;

        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else if (average >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Total Marks: " + total);
        System.out.println("Maximum Marks: " + (subjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        if (grade == 'F') {
            System.out.println("Result: Fail");
        } else {
            System.out.println("Result: Pass");
        }

        sc.close();
    }
}
