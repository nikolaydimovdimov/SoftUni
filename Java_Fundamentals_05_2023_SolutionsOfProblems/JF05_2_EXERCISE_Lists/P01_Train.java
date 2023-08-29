package JF05_2_EXERCISE_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> passengersInWagonsList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int passengersMax = Integer.parseInt(scanner.nextLine());

        String controlText = scanner.nextLine();

        while (!controlText.equals("end")) {
            if (controlText.contains("Add")) {
                int passengersToAdd = Integer.parseInt(controlText.split(" ")[1]);
                passengersInWagonsList.add(passengersToAdd);
            } else {
                int passengersToFit = Integer.parseInt(controlText);
                for (int i = 0; i < passengersInWagonsList.size(); i++) {
                    int currentPassengers = passengersInWagonsList.get(i);
                    if (currentPassengers + passengersToFit <= passengersMax) {
                        passengersInWagonsList.set(i, currentPassengers + passengersToFit);
                        break;
                    }
                }
            }
            controlText = scanner.nextLine();
        }
        System.out.println(passengersInWagonsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
