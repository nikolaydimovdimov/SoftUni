package JF02_1_LAB_Data_Types_and_Variables;

import java.util.Scanner;

public class P05_ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String delimiter = scanner.nextLine();
        System.out.println(firstName + delimiter + secondName);
    }
}
