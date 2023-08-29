package JF01_2_EXERCISE_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double totalPrice = Math.ceil(students * 1.1) * priceOfLightsabers + students * priceOfRobes + (students - students / 6) * priceOfBelts;
        if (totalPrice > amountOfMoney) {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - amountOfMoney);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }
    }
}
