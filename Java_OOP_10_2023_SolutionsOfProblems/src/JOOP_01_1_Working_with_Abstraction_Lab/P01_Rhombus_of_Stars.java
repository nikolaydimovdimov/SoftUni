package JOOP_01_1_Working_with_Abstraction_Lab;

import java.util.Scanner;

public class P01_Rhombus_of_Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print(toStringRhombus(n));
    }

    private static String toStringLine(int index, int size) {
        StringBuilder line = new StringBuilder();
        line.append(" ".repeat( size - index));
        line.append("* ".repeat( index));
        return line.toString();
    }

    private static String toStringRhombus(int size) {
        StringBuilder rhombus = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            rhombus.append(toStringLine(i, size)).append(System.lineSeparator());
        }
        for (int i = size - 1; i > 0; i--) {
            rhombus.append(toStringLine(i, size)).append(System.lineSeparator());
        }
        return rhombus.toString();
    }
}
