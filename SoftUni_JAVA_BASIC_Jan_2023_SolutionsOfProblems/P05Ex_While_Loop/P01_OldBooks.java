package P05Ex_While_Loop;

import java.util.Scanner;

public class P01_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameWantedBook = scanner.nextLine();
        String nameCurrentBook = scanner.nextLine();
        int counter = 0;
        while (!nameCurrentBook.equals(nameWantedBook) && !nameCurrentBook.equals("No More Books")) {
            nameCurrentBook = scanner.nextLine();
            counter++;
        }
        if (nameCurrentBook.equals("No More Books")) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counter);
        } else {
            System.out.printf("You checked %d books and found it.", counter);
        }
    }
}
