package JOOP_04_1_Interfaces_and_Abstraction_Lab.P06_Ferrari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println(new Ferrari(name));
    }
}
