package JF06_2_Ex_Obj_Classes_P05_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Vehicle> catalogue = new ArrayList<>();

        while (!line.equals("End")) {
            Vehicle nextVehicle = new Vehicle(line.split(" ")[0], line.split(" ")[1],
                    line.split(" ")[2], Integer.parseInt(line.split(" ")[3]));
            catalogue.add(nextVehicle);
            line = scanner.nextLine();
        }

        line = scanner.nextLine();

        while (!line.equals("Close the Catalogue")) {
            for (Vehicle vehicle : catalogue) {
                if (vehicle.getModel().equals(line)) {
                    System.out.println(vehicle.print());
                }
            }
            line = scanner.nextLine();
        }

        int sumHorsepowerOfTrucks = 0;
        int countOfTrucks = 0;
        int sumHorsepowerOfCars = 0;
        int countOfCars = 0;

        for (Vehicle vehicle : catalogue) {
            if (vehicle.getType().equals("truck")) {
                countOfTrucks++;
                sumHorsepowerOfTrucks += vehicle.getHorsePower();
            } else {
                countOfCars++;
                sumHorsepowerOfCars += vehicle.getHorsePower();
            }
        }

        double result = 0;
        if (countOfCars > 0) {
            result = sumHorsepowerOfCars * 1.0 / countOfCars;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", result);

        result = 0;
        if (countOfTrucks > 0) {
            result = sumHorsepowerOfTrucks * 1.0 / countOfTrucks;
        }
        System.out.printf("Trucks have average horsepower of: %.2f.%n", result);
    }
}
