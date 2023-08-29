package JF02_1_LAB_Data_Types_and_Variables;

import java.util.Scanner;

public class P04_TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfCity = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        short area = Short.parseShort(scanner.nextLine());
        System.out.printf("Town %s has population of %d and area %d square km.", nameOfCity, population, area);
    }
}
