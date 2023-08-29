package JF08_Exercise_Text_Processing;

import java.util.Scanner;

public class P02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] textsArr = scanner.nextLine().split(" ");
        int chMultiplier = 0;
        for (int i = 0; i < Math.max(textsArr[0].length(), textsArr[1].length()); i++) {
            chMultiplier += convertChToCodeOr1(textsArr[0], i) * convertChToCodeOr1(textsArr[1], i);
        }
        System.out.println(chMultiplier);
    }

    public static int convertChToCodeOr1(String str, int index) {
        if (index < 0) return -1;
        if (index < str.length()) return (int) str.charAt(index);
        return 1;
    }

}
