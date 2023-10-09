package JADV6_2_Ex_Defining_Classes_P04_RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RawData_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCars = Integer.parseInt(scanner.nextLine());

        List<Car> companyCars = new ArrayList<>();

        while (numberOfCars-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int speed = Integer.parseInt(input[1]);
            int power = Integer.parseInt(input[2]);
            int weight = Integer.parseInt(input[3]);
            String type = input[4];
            double[] tyrePressure = new double[4];
            int[] tyreAge = new int[4];
            int inputCounter = 5;
            for (int i = 0; i < 4; i++) {
                tyrePressure[i] = Double.parseDouble(input[inputCounter]);
                inputCounter++;
                tyreAge[i] = Integer.parseInt(input[inputCounter]);
                inputCounter++;
            }
            companyCars.add(new Car(model, speed, power, weight, type, tyrePressure, tyreAge));
        }
        String command = scanner.nextLine();
        if (command.equals("fragile")) {
            companyCars.stream().filter(car -> (car.getMinPressure() < 1 && car.getCargoType().equals("fragile")))
                    .forEach(car -> System.out.println(car.getModel()));
        } else {
            companyCars.stream().filter(car -> (car.getPower() > 250 && car.getCargoType().equals("flamable")))
                    .forEach(car -> System.out.println(car.getModel()));
        }
    }
}
