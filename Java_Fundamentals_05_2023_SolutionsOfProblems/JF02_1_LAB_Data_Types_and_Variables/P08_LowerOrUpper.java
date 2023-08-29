package JF02_1_LAB_Data_Types_and_Variables;

import java.util.Scanner;

public class P08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char charToCheck = scanner.nextLine().charAt(0);

//        if(charToCheck>='a' && charToCheck<='z' ){
//            System.out.println("lower-case");
//        }else {
//            System.out.println("upper-case");
//        }

//        if ( Character.isLowerCase(charToCheck)) {
//            System.out.println("lower-case");
//        } else {
//            System.out.println("upper-case");
//
//        }

        if ((int) charToCheck > 90) {
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");

        }
    }
}
