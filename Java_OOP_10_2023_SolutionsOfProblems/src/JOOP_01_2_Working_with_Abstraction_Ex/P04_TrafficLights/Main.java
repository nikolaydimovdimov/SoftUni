package JOOP_01_2_Working_with_Abstraction_Ex.P04_TrafficLights;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<TrafficLights> trafficLightsList = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(TrafficLights::new)
                .toList();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            trafficLightsList.forEach(el -> System.out.print(el.switchLight() + " "));
            System.out.println();
        }
    }
}
