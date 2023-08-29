package P05Ex_While_Loop;

import java.util.Scanner;

public class P07_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wight = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int countPackage = wight * length * height;
        String input = "";
        while (countPackage > 0) {
            input = scanner.nextLine();
            if (input.equals("Done")) {
                break;
            }
            countPackage -= Integer.parseInt(input);
        }
        if (input.equals("Done")) {
            System.out.printf("%d Cubic meters left.", countPackage);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", -countPackage);
        }
    }
}
