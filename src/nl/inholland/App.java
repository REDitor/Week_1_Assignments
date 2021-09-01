package nl.inholland;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        App p = new App();
        p.start();
    }

    void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter course name: ");
        String course = scanner.nextLine();

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        System.out.println();

        String[] students = new String[numberOfStudents];
        int[] grades = new int[numberOfStudents];

        String bestStudent = "";
        int bestGrade = 0;
        double gradeSum = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter name of student " + (i+1) + ": ");
            students[i] = scanner.next();
        }
        System.out.println();

        for (int i = 0; i < numberOfStudents; i++){
            System.out.print("Enter grade of " + students[i] + ": ");
            grades[i] = scanner.nextInt();

            gradeSum += grades[i];

            if (grades[i] >= bestGrade){
                bestGrade = grades[i];
                bestStudent = students[i];
            }
        }
        System.out.println();

        double avg = gradeSum / numberOfStudents;

        System.out.println("Average grade: " + String.format("%,.1f", avg));
        System.out.println("Student " + bestStudent + " has maximum grade: " + bestGrade);

        System.out.println();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Grade for student " + students[i] + "(course " + course + "): " + grades[i]);
        }

        scanner.close();
    }
}
