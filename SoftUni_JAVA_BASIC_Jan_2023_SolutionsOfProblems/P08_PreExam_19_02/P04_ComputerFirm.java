package P08_PreExam_19_02;

import java.util.Scanner;

public class P04_ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberComputers = Integer.parseInt(scanner.nextLine());

        int ratingTotal = 0;
        double salesTotal = 0;

        for (int count = 1; count <= numberComputers; count++) {
            int salesAndRating = Integer.parseInt(scanner.nextLine());
            int rating = salesAndRating % 10;
            ratingTotal += rating;
            int sales = salesAndRating / 10;
            switch (rating) {
                case 3:
                    salesTotal += sales * 0.5;
                    break;
                case 4:
                    salesTotal += sales * 0.7;
                    break;
                case 5:
                    salesTotal += sales * 0.85;
                    break;
                case 6:
                    salesTotal += sales;
                    break;
            }
        }
        System.out.printf("%.2f%n", salesTotal);
        System.out.printf("%.2f", ratingTotal * 1.0 / numberComputers);
    }
}
