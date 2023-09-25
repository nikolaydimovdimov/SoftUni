package JADV3_1_LAB_Sets_and_Maps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> setCars = new LinkedHashSet<>();

        String[] input = scanner.nextLine().split(", ");

        while (!input[0].equals("END")) {
            if (input[0].equals("IN")) {
                setCars.add(input[1]);
            } else {
                setCars.remove(input[1]);
            }
            input = scanner.nextLine().split(", ");
        }
        if (setCars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
//          for (String car : setCars) {
//             System.out.println(car);
//          }
            setCars.forEach(e -> System.out.println(e));
        }
    }
}
