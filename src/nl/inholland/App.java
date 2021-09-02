package nl.inholland;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the size of your group and press [ENTER]: ");
        int numberOfStudents = scanner.nextInt();

        System.out.println("group size: " + numberOfStudents);

        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student();
            System.out.print("Please enter the name of student: " + (i+1) + " and press [ENTER]: ");
            students[i].name = scanner.next();
        }
        System.out.println();

        for (int i = 0; i < numberOfStudents; i++){
            System.out.println("Student #" + (i+1) + ": " + students[i].name);
        }
        System.out.println();

        for (int i = 0; i < numberOfStudents; i++){
            System.out.print("Is student #" + (i+1) + "(" + students[i].name + ") present? [Y/N + ENTER]: ");
            String answer = scanner.next();

            if (answer.equals("y") || answer.equals("Y".toLowerCase())) {
                students[i].present = true;
            }
        }
        System.out.println();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student #" + (i+1) + ": " + students[i].name +    "| Present: " +
                    "" + students[i].present);
        }
    }
}
