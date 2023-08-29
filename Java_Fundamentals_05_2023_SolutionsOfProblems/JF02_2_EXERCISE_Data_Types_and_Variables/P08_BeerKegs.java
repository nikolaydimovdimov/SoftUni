package JF02_2_EXERCISE_Data_Types_and_Variables;

import java.util.Scanner;

public class P08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfKegs = Integer.parseInt(scanner.nextLine());

        double volumeOfBiggestKeg = 0;
        String modelOfBiggestKeg = "";

        for (int i = 0; i < numberOfKegs; i++) {
            String modelOfKeg = scanner.nextLine();
            double radiusOfKeg = Double.parseDouble(scanner.nextLine());
            int heightOfKeg = Integer.parseInt(scanner.nextLine());
            double volumeOfKeg = Math.PI * Math.pow(radiusOfKeg, 2) * heightOfKeg;
            if (volumeOfKeg > volumeOfBiggestKeg) {
                volumeOfBiggestKeg = volumeOfKeg;
                modelOfBiggestKeg = modelOfKeg;
            }
        }
        System.out.println(modelOfBiggestKeg);
    }
}
