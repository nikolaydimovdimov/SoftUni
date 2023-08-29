package JF4_1_LAB_Methods;

import java.util.Scanner;

public class P06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double area = rectangleArea(width, length);

        System.out.printf("%.0f", area);
    }

    public static double rectangleArea(double width, double length) {
        return width * length;
    }
}
