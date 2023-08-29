package JF055MidExamPreparation_12_Jun_2023.P01;

import java.util.Arrays;
import java.util.Scanner;

public class PE03_HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] neighborhood = Arrays
                .stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String jump = scanner.nextLine();
        int position = 0;

        while (!jump.equals("Love!")) {
            String[] jumpElement = jump.split(" ");
            position += Integer.parseInt(jumpElement[1]);

            if (position >= neighborhood.length) {
                position = 0;
            }

            if (neighborhood[position] == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", position);
            } else {
                neighborhood[position] -= 2;

                if (neighborhood[position] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", position);
                }
            }

            jump = scanner.nextLine();
        }
        boolean isMissionSuccessful = true;
        int failedPlaces = 0;

        for (int el : neighborhood) {
            if (el > 0) {
                isMissionSuccessful = false;
                failedPlaces++;
            }
        }

        System.out.printf("Cupid's last position was %d.%n", position);
        if (isMissionSuccessful) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.%n", failedPlaces);
        }
    }
}
