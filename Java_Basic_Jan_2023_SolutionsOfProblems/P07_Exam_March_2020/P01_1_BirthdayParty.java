package P07_Exam_March_2020;

import java.util.Scanner;

public class P01_1_BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hallPrice = Double.parseDouble(scanner.nextLine());
        double cake = hallPrice * 0.2;
        double drinks = cake * 0.55;
        double partyMan = hallPrice / 3;
        System.out.printf("%.1f", cake + drinks + partyMan + hallPrice);
    }
}
