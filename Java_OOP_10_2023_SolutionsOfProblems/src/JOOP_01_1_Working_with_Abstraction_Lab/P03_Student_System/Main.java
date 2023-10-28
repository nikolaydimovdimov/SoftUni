package JOOP_01_1_Working_with_Abstraction_Lab.P03_Student_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentSystem studentSystem = new StudentSystem();

        String[] input = scanner.nextLine().split(" ");
        String command=input[0];

        while (!command.equals("Exit")) {
            switch (input[0]) {
                case "Create":
                    create(studentSystem, input);
                    break;
                case "Show":
                    show(studentSystem, input);
                    break;
            }
            input = scanner.nextLine().split(" ");
            command=input[0];
        }
    }

    private static void show(StudentSystem studentSystem, String[] input) {
        String name = input[1];
        if (studentSystem.getStudent(name) == null) return;
        System.out.println(studentSystem.getStudent(name));
    }

    private static void create(StudentSystem studentSystem, String[] input) {
        String name = input[1];
        int age = Integer.parseInt(input[2]);
        double grade = Double.parseDouble(input[3]);
        studentSystem.create(name, age, grade);
    }
}
