package P01Ex_FirstStepsInCoding;

import java.util.Scanner;

public class P06_Repainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nylonSqrm = Integer.parseInt(scanner.nextLine());
        int paintLtrs = Integer.parseInt(scanner.nextLine());
        int thinnerLtrs = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double materialsPrice = (nylonSqrm + 2) * 1.50 + paintLtrs * 1.1 * 14.50 + thinnerLtrs * 5.00 + 0.40;
        double workPrice = hours * materialsPrice * 0.30;

        System.out.println(materialsPrice + workPrice);

    }
}
