package JF10_Final_Exam_Preparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> carMileageMap = new LinkedHashMap<>();
        Map<String, Integer> carFuelMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        String[] input;

        for (int i = 0; i < n; i++) {
            input = scanner.nextLine().split("\\|");
            carMileageMap.putIfAbsent(input[0], Integer.parseInt(input[1]));
            carFuelMap.putIfAbsent(input[0], Integer.parseInt(input[2]));
        }

        input = scanner.nextLine().split(" : ");
        while (!input[0].equals("Stop")) {
            String car = input[1];
            int distance, fuel;
            switch (input[0]) {
                case "Drive":
                    distance = Integer.parseInt(input[2]);
                    fuel = Integer.parseInt(input[3]);
                    if (fuel > carFuelMap.get(car)) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        carMileageMap.put(car, carMileageMap.get(car) + distance);
                        carFuelMap.put(car, carFuelMap.get(car) - fuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                        if (carMileageMap.get(car) > 100000) {
                            System.out.printf("Time to sell the %s!%n", car);
                            carMileageMap.remove(car);
                            carFuelMap.remove(car);
                        }
                    }
                    break;
                case "Refuel":
                    fuel = Integer.parseInt(input[2]);
                    if (fuel + carFuelMap.get(car) > 75) {
                        fuel = 75 - carFuelMap.get(car);
                        carFuelMap.put(car, 75);
                    } else {
                        carFuelMap.put(car, carFuelMap.get(car) + fuel);
                    }
                    System.out.printf("%s refueled with %d liters%n", car, fuel);
                    break;
                case "Revert":
                    distance = Integer.parseInt(input[2]);
                    if (carMileageMap.get(car) - distance < 10000) {
                        carMileageMap.put(car, 10000);
                    } else {
                        carMileageMap.put(car, carMileageMap.get(car) - distance);
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, distance);
                    }
                    break;
            }
            input = scanner.nextLine().split(" : ");
        }
        for (Map.Entry<String, Integer> car : carMileageMap.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                    car.getKey(), car.getValue(), carFuelMap.get(car.getKey()));
        }

    }
}
