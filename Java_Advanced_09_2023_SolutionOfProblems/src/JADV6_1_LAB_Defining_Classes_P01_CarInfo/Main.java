package JADV6_1_LAB_Defining_Classes_P01_CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> carsList = new ArrayList<>();

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        while (numberOfCars-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            if(input.length==1){
                carsList.add(new Car(input[0]));
            }else {
                carsList.add(new Car(input[0],
                        input[1],
                        Integer.parseInt(input[2])));
            }
        }

        carsList.forEach(el -> System.out.println(el.carInfo()));
    }
}
