package nl.inholland;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print(name + " " + age);

        scanner.close();
    }
}
