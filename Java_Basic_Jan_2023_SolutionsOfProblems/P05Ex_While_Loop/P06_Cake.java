package P05Ex_While_Loop;

import java.util.Scanner;

public class P06_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int widthCake = Integer.parseInt(scanner.nextLine());
        int lengthCake = Integer.parseInt(scanner.nextLine());
        int piecesCake = widthCake * lengthCake;
        int getPieces = 0;
        String input = "";
        while (piecesCake > 0) {
            input = scanner.nextLine();
            if (input.equals("STOP")) {
                break;
            }
            getPieces = Integer.parseInt(input);
            piecesCake -= getPieces;

        }
        if (input.equals("STOP")) {
            System.out.printf("%d pieces are left.", piecesCake);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", -piecesCake);
        }
    }
}
