package JOOP_01_1_Working_with_Abstraction_Lab.P02_Point_in_Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Rectangle myRectangle = new Rectangle(new Point(coordinates[0], coordinates[1]), new Point(coordinates[2], coordinates[3]));
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            int[] pointCoordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            System.out.println(myRectangle.contains(new Point(pointCoordinates[0], pointCoordinates[1])));
        }
    }
}
