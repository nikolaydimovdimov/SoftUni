package JF02_2_EXERCISE_Data_Types_and_Variables;

import java.util.Scanner;

public class P03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacityOfElevator = Integer.parseInt(scanner.nextLine());
        int numberOfCourses = numberOfPeople / capacityOfElevator;
        if (numberOfPeople % capacityOfElevator != 0) {
            numberOfCourses++;
        }
        System.out.println(numberOfCourses);
    }
}

