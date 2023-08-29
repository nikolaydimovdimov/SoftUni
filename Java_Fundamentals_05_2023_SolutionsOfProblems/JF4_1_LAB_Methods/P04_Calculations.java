package JF4_1_LAB_Methods;

import java.util.Scanner;

public class P04_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int numberFirst = Integer.parseInt(scanner.nextLine());
        int numberSecond = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                addNumbers(numberFirst, numberSecond);
                break;
            case "multiply":
                multiplyNumbers(numberFirst, numberSecond);
                break;
            case "subtract":
                subtractNumbers(numberFirst, numberSecond);
                break;
            case "divide":
                divideNumbers(numberFirst, numberSecond);
                break;
        }
    }

    public static void addNumbers(int nFirst, int nSecond) {
        System.out.println(nFirst + nSecond);
    }

    public static void multiplyNumbers(int nFirst, int nSecond) {
        System.out.println(nFirst * nSecond);
    }

    public static void subtractNumbers(int nFirst, int nSecond) {
        System.out.println(nFirst - nSecond);
    }

    public static void divideNumbers(int nFirst, int nSecond) {
        System.out.println(nFirst / nSecond);
    }
}


