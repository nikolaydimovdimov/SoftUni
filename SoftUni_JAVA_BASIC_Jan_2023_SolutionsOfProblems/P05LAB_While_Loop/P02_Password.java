package P05LAB_While_Loop;

import java.util.Scanner;

public class P02_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String pass = scanner.nextLine();
        String newPass = "";
        while (!newPass.equals(pass)) {
            newPass = scanner.nextLine();
        }
        System.out.println("Welcome " + name + "!");
    }
}
