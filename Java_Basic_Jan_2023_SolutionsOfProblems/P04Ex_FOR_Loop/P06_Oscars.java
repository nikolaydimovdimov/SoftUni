package P04Ex_FOR_Loop;

import java.util.Scanner;

public class P06_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameArtist = scanner.nextLine();
        String nameJury = "";
        double pointsJury = 0;
        double points = Double.parseDouble(scanner.nextLine());
        int numberJury = Integer.parseInt(scanner.nextLine());
        for (; numberJury > 0 && points <= 1250.5; numberJury--) {
            nameJury = scanner.nextLine();
            pointsJury = Double.parseDouble(scanner.nextLine());
            points += nameJury.length() * pointsJury / 2;
        }
        if (points > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!"
                    , nameArtist, points);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", nameArtist, 1250.5 - points);
        }
    }
}
